import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortParagraphTest {
SortParagraph ob=null;
    @Before
    public void setUp() throws Exception {

    ob=new SortParagraph();
    }

    @After
    public void tearDown() throws Exception {
    ob=null;}

@Test
    public void checkInput(){

        String str="hello my name is anmol";
        StringBuilder sb=new StringBuilder(str);
        assertEquals("ehllo my aemn is almno",ob.sort(str));
        assertEquals("invalid input",ob.sort(1234567));

}
}