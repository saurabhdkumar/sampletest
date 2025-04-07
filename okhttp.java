OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\n    \"message\": \"Invoked AWS LAMBDA\",\n    \"text_response\": \"Some response expected\"\n}");
Request request = new Request.Builder()
  .url("https://lbd5g5hwpcwaxulaxe3smtbahq0ngxzk.lambda-url.us-east-1.on.aws/")
  .method("GET", body)
  .addHeader("Content-Type", "application/json")
  .build();
Response response = client.newCall(request).execute();


OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\n    \"message\": \"Invoked AWS LAMBDA\",\n    \"text_response\": \"Some response expected\"\n}");
Request request = new Request.Builder()
  .url("https://lbd5g5hwpcwaxulaxe3smtbahq0ngxzk.lambda-url.us-east-1.on.aws/")
  .method("POST", body)
  .addHeader("Content-Type", "application/json")
  .build();
Response response = client.newCall(request).execute();


OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\n    \"message\": \"Invoked AWS LAMBDA\",\n    \"text_response\": \"Some response expected\"\n}");
Request request = new Request.Builder()
  .url("https://lbd5g5hwpcwaxulaxe3smtbahq0ngxzk.lambda-url.us-east-1.on.aws/")
  .method("PUT", body)
  .addHeader("Content-Type", "application/json")
  .build();
Response response = client.newCall(request).execute();


OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\n    \"message\": \"Invoked AWS LAMBDA\",\n    \"text_response\": \"Some response expected\"\n}");
Request request = new Request.Builder()
  .url("https://lbd5g5hwpcwaxulaxe3smtbahq0ngxzk.lambda-url.us-east-1.on.aws/")
  .method("PATCH", body)
  .addHeader("Content-Type", "application/json")
  .build();
Response response = client.newCall(request).execute();


OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\n    \"message\": \"Invoked AWS LAMBDA\",\n    \"text_response\": \"Some response expected\"\n}");
Request request = new Request.Builder()
  .url("https://lbd5g5hwpcwaxulaxe3smtbahq0ngxzk.lambda-url.us-east-1.on.aws/")
  .method("DELETE", body)
  .addHeader("Content-Type", "application/json")
  .build();
Response response = client.newCall(request).execute();


OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
Request request = new Request.Builder()
  .url("https://lbd5g5hwpcwaxulaxe3smtbahq0ngxzk.lambda-url.us-east-1.on.aws/")
  .method("HEAD", null)
  .addHeader("Content-Type", "application/json")
  .build();
Response response = client.newCall(request).execute();


OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\n    \"message\": \"Invoked AWS LAMBDA\",\n    \"text_response\": \"Some response expected\"\n}");
Request request = new Request.Builder()
  .url("https://lbd5g5hwpcwaxulaxe3smtbahq0ngxzk.lambda-url.us-east-1.on.aws/")
  .method("OPTIONS", body)
  .addHeader("Content-Type", "application/json")
  .build();
Response response = client.newCall(request).execute();


