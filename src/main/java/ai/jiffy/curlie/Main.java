package ai.jiffy.curlie;

public class Main {
  public static void main(String[] args) {
    var bcp = new BasicCurlParser();
    var ex = """
curl -L -X POST 'http://localhost:7443/rest/v1/rmuser/2' -H 'X-Auth-Token:eyJ
0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE2MTk2MTg3ODAsImV4cCI6MTYxOTYyMjM4MC
wianRpIjoiMGRjYWRkMWIyODNlNDc5ZGI3ZTJkNzZmZmJlMGI2NjAiLCJzdiI6eyJ1c2VyIjoic3VwZ
XJ1c2VyIn19.f_NzcKZEUUf3UWaH4JQeasi7BPSTkBcfPe9AMrQOeQyEXp7ZU9wsJn7E9AjjaIKVM7U
sT22HvslLVo5LXTNEkg' -H 'Content-Type: application/json' --data-raw ''
""";

    System.out.println(bcp.parse(ex));
  }
}

//curl 'http://google.com/'  -H 'Accept-Encoding: gzip, deflate, sdch'   -H 'Accept-Language: en-US,en;q=0.8,da;q=0.6'   -H 'Upgrade-Insecure-Requests: 1'   -H 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36'   -H 'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8'   -H 'Connection: keep-alive' --compressed

/**
 curl --request POST \
  --url https://api.sendgrid.com/v3/mail/send \
  --header 'Authorization: Bearer YOUR_API_KEY' \
  --header 'Content-Type: application/json' \
  --data '{"personalizations": [{"to": [{"email": "recipient@example.com"}]}],"from": {"email": "sendeexampexample@example.com"},"subject": "Hello, World!","content": [{"type": "text/plain", "value": "Heya!"}]}'
 */

/**
curl --request POST \
  --url https://api.sendgrid.com/v3/mail/send \
  --header 'authorization: Bearer YOUR_API_KEY' \
  --header 'Content-Type: application/json' \
  --data '{"personalizations": [{"to": [{"email": "recipient@example.com"}]}],"from": {"email": "sendeexampexample@example.com"},"subject":"Hello, World!","content": [{"type": "text/plain","value": "Heya!"}], "send_at" : UNIX_TIMESTAMP_HERE}'
*/

/**
curl -d '{"key": "value"}' \
   -H "Content-Type: application/json" \
   https://example.com/api/post-endpoint
 */
