package ai.jiffy.curlie;

public class Cookie {

  private String path;
  private String domain;
  private String value;
  private String name;

  public String getPath() {
    return path;
  }

  public String getDomain() {
    return domain;
  }

  public String getValue() {
    return value;
  }

  public String getName() {
    return name;
  }
    
  public void setName(String string) {
    this.name = string;
  }

  public void setValue(String string) {
    this.value = string;
  }

  public void setDomain(String host) {
    this.domain = host;
  }

  public void setPath(String path) {
    this.path = path;
  }

}
