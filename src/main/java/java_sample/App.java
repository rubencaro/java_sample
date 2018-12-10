
package java_sample;

public class PipeData {
    public static enum Status {
        OK, ERROR
    }

    public Status status = Status.OK;
    public String request = "";
    public String reason = "";

    public bool is_error?(){ return status == Status.OK; }
}

public class App {

    static class D extends PipeData {
        int v = 12;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public D pipe1(D d) {
        return d;
    }

    public D pipe2(D d) {
        if(d.is_error?()) return d;

        // do something
        return d;
    }
}
