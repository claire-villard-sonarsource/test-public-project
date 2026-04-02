package hello;

public class Greeter {
  public String sayHello() {
    return "Hello world!";
  }

  public void fail() {
    throw new RuntimeException("Nope");
  }

}
