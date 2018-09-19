import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
ReplaceCharacter ob=null;
    @Before
    public void setUp() throws Exception {

    ob=new ReplaceCharacter();

    }

    @After
    public void tearDown() throws Exception {

    ob=null;
    }

    @Test
    public void checkInput(){

        String testStr="daily dry";

        assertEquals("faity fry",ob.replaceString(testStr));
        assertEquals("ffff",ob.replaceString("dddd"));

        assertEquals("ttttt",ob.replaceString("lllll"));

        assertEquals("invalid input",ob.replaceString(123456786));






    }



}