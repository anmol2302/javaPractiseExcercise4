import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternFinderTest {
PatternFinder ob=null;
    @Before
    public void setUp() throws Exception {

    ob=new PatternFinder();

    }

    @After
    public void tearDown() throws Exception {

    ob=null;
    }

    @Test
    public void checkResult(){

        String test="this is Harry";
        String test1="this is henry";
        assertEquals("is Harry here? true",ob.findMatches(test));
        assertEquals("is Harry here? false",ob.findMatches(test1));
        assertEquals("invalid input",ob.findMatches(12345));


    }


}