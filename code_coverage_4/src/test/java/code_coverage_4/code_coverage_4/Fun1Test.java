package code_coverage_4.code_coverage_4;

	import org.junit.Test;
	import static org.junit.Assert.*;

	public class Fun1Test {

	    @Test
	    public void testConditionTrueTrue() {
	        int result = Fun1.func1(1, 0, 10);
	        assertEquals(1, result);
	    }

	    @Test(expected = ArithmeticException.class)
	    public void testConditionFalseTrue() {
	        Fun1.func1(0, 0, 10); // כאן נזרקת החריגה
	    }
	}



