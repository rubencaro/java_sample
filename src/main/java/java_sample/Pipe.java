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

  public Pipe complex() {
    if (!this.isOK())
      return this;

    return this.maybeLogic1().maybeLogic2().maybeLogic3();
  }

  private Pipe maybeLogic1() {
    if (!this.condition1())
      return this;
    this.value = "Hello World! 1";
    return this;
  }

  private Pipe maybeLogic2() {
    if (!this.condition2())
      return this;
    this.value = "Hello World! 2";
    return this;
  }

  private Pipe maybeLogic3() {
    if (!this.condition3())
      return this;
    this.value = "Hello World! 3";
    return this;
  }

  private boolean condition1() {
    return false;
  }

  private boolean condition2() {
    return true;
  }

  private boolean condition3() {
    return false;
  }

  public String pipeLast() {
    if (this.isOK())
      return this.value;
    return "Errored";
  }

  public Pipe setError() {
    this.status = Status.ERROR;
    return this;
  }
}
