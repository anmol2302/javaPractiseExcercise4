import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
TransposeString ob=null;
    @Before
    public void setUp() throws Exception {


    ob=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {

    ob=null;
    }


    @Test
    public void validateInput(){
      //  assertEquals("invalid input",ob.doTranspose(123456));
        assertEquals("a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god",ob.doTranspose("a quick brown fox jumps over the lazy dog"));
        assertEquals("a  god",ob.doTranspose("a dog"));

    }
}