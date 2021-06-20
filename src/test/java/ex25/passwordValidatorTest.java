package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidatorTest {
    public static passwordValidator pv;
    @Test
    public void passwordTest(){
        pv = new passwordValidator();
    }
    void check()
    {
        String a = "12345";
        String b ="abcdef";
        String c = "abc123xyz";
        String d = "1337H@xor!";
        assertEquals(1,a);
        assertEquals(2,b);
        assertEquals(3,c);
        assertEquals(4,d);
    }
}