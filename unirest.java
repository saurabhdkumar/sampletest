Unirest.setTimeouts(0, 0);
HttpResponse<String> response = Unirest.get("https://dri6jl3zr4hwrqh2dhgdsyxpiu0lfqvl.lambda-url.us-east-1.on.aws/")
  .header("Content-Type", "application/json")
  .body("{\n    \"message\": \"Invoked Unirest\",\n    \"pii_data\": \"Some response expected\",\n    \"email\": \"saurabh.d.kumar\",\n    \"phone\": \"0987654321\"\n}")
  .asString();


Unirest.setTimeouts(0, 0);
HttpResponse<String> response = Unirest.post("https://dri6jl3zr4hwrqh2dhgdsyxpiu0lfqvl.lambda-url.us-east-1.on.aws/")
  .header("Content-Type", "application/json")
  .body("{\n    \"message\": \"Invoked Unirest\",\n    \"pii_data\": \"Some response expected\",\n    \"email\": \"saurabh.d.kumar\",\n    \"phone\": \"0987654321\"\n}")
  .asString();


Unirest.setTimeouts(0, 0);
HttpResponse<String> response = Unirest.put("https://dri6jl3zr4hwrqh2dhgdsyxpiu0lfqvl.lambda-url.us-east-1.on.aws/")
  .header("Content-Type", "application/json")
  .body("{\n    \"message\": \"Invoked Unirest\",\n    \"pii_data\": \"Some response expected\",\n    \"email\": \"saurabh.d.kumar\",\n    \"phone\": \"0987654321\"\n}")
  .asString();


Unirest.setTimeouts(0, 0);
HttpResponse<String> response = Unirest.patch("https://dri6jl3zr4hwrqh2dhgdsyxpiu0lfqvl.lambda-url.us-east-1.on.aws/")
  .header("Content-Type", "application/json")
  .body("{\n    \"message\": \"Invoked Unirest\",\n    \"pii_data\": \"Some response expected\",\n    \"email\": \"saurabh.d.kumar\",\n    \"phone\": \"0987654321\"\n}")
  .asString();


Unirest.setTimeouts(0, 0);
HttpResponse<String> response = Unirest.delete("https://dri6jl3zr4hwrqh2dhgdsyxpiu0lfqvl.lambda-url.us-east-1.on.aws/")
  .header("Content-Type", "application/json")
  .body("{\n    \"message\": \"Invoked Unirest\",\n    \"pii_data\": \"Some response expected\",\n    \"email\": \"saurabh.d.kumar\",\n    \"phone\": \"0987654321\"\n}")
  .asString();


Unirest.setTimeouts(0, 0);
HttpResponse<String> response = Unirest.head("https://dri6jl3zr4hwrqh2dhgdsyxpiu0lfqvl.lambda-url.us-east-1.on.aws/")
  .header("Content-Type", "application/json")
  .body("{\n    \"message\": \"Invoked Unirest\",\n    \"pii_data\": \"Some response expected\",\n    \"email\": \"saurabh.d.kumar\",\n    \"phone\": \"0987654321\"\n}")
  .asString();


Unirest.setTimeouts(0, 0);
HttpResponse<String> response = Unirest.options("https://dri6jl3zr4hwrqh2dhgdsyxpiu0lfqvl.lambda-url.us-east-1.on.aws/")
  .header("Content-Type", "application/json")
  .body("{\n    \"message\": \"Invoked Unirest\",\n    \"pii_data\": \"Some response expected\",\n    \"email\": \"saurabh.d.kumar\",\n    \"phone\": \"0987654321\"\n}")
  .asString();
