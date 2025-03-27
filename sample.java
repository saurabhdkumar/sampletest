OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("text/plain");
RequestBody body = RequestBody.create(mediaType, "");
Request request = new Request.Builder()
  .url("https://google.com")
  .method("GET", body)
  .addHeader()
  .build();
Response response = client.newCall(request).execute();
