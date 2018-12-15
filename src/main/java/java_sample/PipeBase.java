package java_sample;

public class PipeBase {
    static enum Status {
        OK, ERROR
    }

    public Status status = Status.OK;

    public boolean isOK() {
        return status == Status.OK;
    }
}
