import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondTest {

    @Test
    void go() {
       assertEquals(10, Second.go(5));
    }
}