package code_coverage_4.code_coverage_4;

	import org.junit.Test;

	public class Fun3Test {

	    @Test(expected = ArithmeticException.class)
	    public void testStatementCoverage() {
	        Fun3.func3(1); // בדיקה של החריגה
	    }
	}



