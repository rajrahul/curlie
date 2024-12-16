package ai.jiffy.curlie;

public class Main {
  public static void main(String[] args) {
    var bcp = new BasicCurlParser();
    var ex = """
curl 'http://localhost:28139' \
  -H 'sec-ch-ua: " Not A;Brand";v="99", "Chromium";v="92"'
""";
    System.out.println(bcp.parse(ex));
  }
}
