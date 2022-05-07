import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class manTest {

    @Test
    void isEvenTest0() {
        man a = new man();
        assertEquals("EVEN", a.isEvenOrOdd(0));
    }
    @Test
    void isEvenTest1(){
        man a = new man();
        assertEquals("ODD", a.isEvenOrOdd(1));
    }
    @Test
    void isEvenTest2(){
        man a = new man();
        assertEquals("EVEN", a.isEvenOrOdd(2));
    }
    @Test
    void isEvenTest100(){
        man a = new man();
        assertEquals("EVEN", a.isEvenOrOdd(100));
    }
    @Test
    void isEvenTestNeg1(){
        man a = new man();
        assertEquals("ODD", a.isEvenOrOdd(-1));
    }

    int array[]= {0,1,2,3,5};
    @Test
    void minTest0(){
        man a = new man();
        assertEquals(0, a.min(array) );
    }
    @Test
    void maxTest0(){
        man a = new man();
        assertEquals(5, a.max(array) );
    }
    int array0[]= {-1,3,51,32542,4};
    @Test
    void minTest1(){
        man a = new man();
        assertEquals(-1, a.min(array0) );
    }
    @Test
    void maxTest1(){
        man a = new man();
        assertEquals(32542, a.max(array0) );
    }

}