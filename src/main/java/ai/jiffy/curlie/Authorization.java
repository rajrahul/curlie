package ai.jiffy.curlie;

public class Authorization {

  private String user;
  private String password;
  private String url;
  private Mechanism mechanism;

  public String getUser() {
    return user;
  }

  public String getPassword() {
    return password;
  }

  public String getUrl() {
    return url;
  }

  public Mechanism getMechanism() {
    return mechanism;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public void setPass(String password) {
    this.password = password;
  }

  public void setURL(String url) {
    this.url = url;
  }

  public void setMechanism(Mechanism mechanism) {
    this.mechanism = mechanism;
  }

}
