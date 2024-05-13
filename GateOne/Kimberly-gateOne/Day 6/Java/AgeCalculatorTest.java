import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeCalculatorTest {
	@Test
	public void testThatUserCanCalculateAge() {

	
	int date = Calculator.AgeCalculator(11/12/2022);

	int expectedAge = 1;
	//assertion
	assertEquals(expectedAge, date);
	}
}
