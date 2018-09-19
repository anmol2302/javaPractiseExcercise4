import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleMatcherOccurenceTest {
MultipleMatcherOccurence ob=null;
    @Before
    public void setUp() throws Exception {
        ob=new MultipleMatcherOccurence();

    }

    @After
    public void tearDown() throws Exception {

        ob=null;
    }


    @Test

    public void checkInput(){

String test="She sells seashells by the seashore";
        assertEquals("Found at: 4 - 6\n"+"Found at: 10 - 12\n"+"Found at: 27 - 29",ob.findSubstring(test,"se"));
        assertEquals("invalid input",ob.findSubstring(12345,2));


    }
}