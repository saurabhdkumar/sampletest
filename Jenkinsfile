pipeline {
    agent any

    environment {
        FILES = """
            okhttp.java
            unirest.java
            sample.py
            reqeusts.py
        """
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                checkout scm
            }
        }
        
        stage('URL Scan') {
            steps {
                echo 'Invoking URL Scanner Plugin...'
                // Calls your URL Scanner build step. 
                // You can provide a custom regex pattern if desired.
                step([$class: 'UrlScannerBuilder', pattern: ''])
            }
        }

        stage('Check File Presence') {
            steps {
                script {
                    def missing = []
                    env.FILES.trim().split().each { file ->
                        if (!fileExists(file)) {
                            missing << file
                        }
                    }
                    if (missing) {
                        error "Missing files: ${missing.join(', ')}"
                    } else {
                        echo "✅ All expected files are present."
                    }
                }
            }
        }

        stage('Check File Content') {
            steps {
                script {
                    env.FILES.trim().split().each { file ->
                        def content = readFile(file)
                        echo "📝 File: ${file}"
                        echo "📏 Line count: ${content.readLines().size()}"
                        if (content.contains("http")) {
                            echo "🔗 ${file} contains REST calls."
                        } else {
                            echo "⚠️ ${file} may be missing REST endpoints."
                        }
                    }
                }
            }
        }

        stage('Summary') {
            steps {
                echo "✅ File checks completed successfully!"
            }
        }
    }

    post {
        failure {
            echo "❌ Some checks failed. Please review the logs above."
        }
    }
}
