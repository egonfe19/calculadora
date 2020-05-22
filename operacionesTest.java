package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class operacionesTest {

	@Test
	void test() {
	    operaciones calculator = new operaciones();
        int a = 2;
        int b = 5;
        int actual = calculator.add(a, b);
     
        int expected = 10;
     
        assertEquals(expected, actual);
    
	}

}
