package java_sample;

import org.junit.Test;
import static org.junit.Assert.*;

public class PipeTest {
    @Test
    public void testPipeSetsValue() {
        assertEquals("Hello World!", new Pipe().setValue().value);
    }
}
