import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurenceTest {
CountOccurence ob=null;
    @org.junit.Before
    public void setUp() throws Exception {


        ob=new CountOccurence();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    ob=null;

    }


    @Test
    public void checkInput(){

        String test1str="hello java";
        assertEquals(2,ob.countOccurence(test1str,"a"));
        assertEquals(-1,ob.countOccurence(12131,1)); // return -1 for invalid input input should be string
        assertEquals(3,ob.countOccurence("hello java there","e"));
        assertEquals(1,ob.countOccurence("hello rhea","rhea"));
    }


}