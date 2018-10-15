import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    @DisplayName("should return hello world")
    @Test
    void shouldGreet(){
        assertEquals("Hello, World!",new Greeter().getGreeting());
    }
}
