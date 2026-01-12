package code_coverage_4.code_coverage_4;

import org.junit.Test;
import static org.junit.Assert.*;

public class Fun2Test {

    @Test
    public void testBranchTrue() {
        String result = Fun2.func2(1f, 10f);
        assertEquals("p=11.00, q=0.91", result); 
    }

    @Test
    public void testBranchFalse() {
        String result = Fun2.func2(0f, 10f);
        assertEquals("p=0.00, q=Infinity", result); 
    }
}







