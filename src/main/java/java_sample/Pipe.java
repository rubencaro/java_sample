package java_sample;

public class Pipe extends PipeBase {
  String value = "";

  public Pipe pipe1() {
    return this;
  }

  public Pipe pipe2() {
    if (!this.isOK())
      return this;

    // do something
    return this;
  }

  public Pipe setValue() {
    if (!this.isOK())
      return this;

    this.value = "Hello World!";
    return this;
  }

  public String pipeLast() {
    return this.value;
  }
}
