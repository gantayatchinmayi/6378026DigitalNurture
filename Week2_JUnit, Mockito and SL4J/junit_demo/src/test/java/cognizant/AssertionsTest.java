package cognizant;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTest {

	@Test
	public void test() {
        
        assertEquals("2 + 3 should equal 5", 5, 2 + 3);  

        assertTrue("5 should be greater than 3", 5 > 3);
        
        assertFalse("5 should not be less than 3", 5 < 3);

        Object nullObj = null;
        assertNull("Object should be null", nullObj);

        Object realObj = new Object();
        assertNotNull("Object should not be null", realObj);

        Object obj1 = realObj;
        assertSame("Objects should be the same instance", realObj, obj1);

        int[] expectedArray = {1, 2, 3};
        int[] actualArray = {1, 2, 3};
        assertArrayEquals("Arrays should match", expectedArray, actualArray);
	}

}
