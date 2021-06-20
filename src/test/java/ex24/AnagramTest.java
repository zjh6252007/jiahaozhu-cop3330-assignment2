package ex24;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    public static Anagram ana;
    @BeforeAll
    public static void testAnagram() throws Exception{
        ana = new Anagram();

    }
    @Test
    void isAnagram(){
        assertEquals(true,ana.isAnagram("note","tone"));
        assertEquals(false,ana.isAnagram("abc","ccc"));
    }

}