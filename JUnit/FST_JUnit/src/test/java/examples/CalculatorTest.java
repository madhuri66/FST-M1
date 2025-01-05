package examples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {	
	Calculator calc = new Calculator();
	
	@Test
	public void addTest(){
		int result1 = calc.add(10, 20);
		int result2 = calc.add(15, 15);
		int result3 = calc.add(25, 5);
		
		assertAll(
				() -> assertEquals(30,result1),
				() -> assertEquals(30,result2),
				() -> assertEquals(30,result3)
				);		
	}
	
	@Test
	public void multiplyTest(){
		
		int result = calc.multiply(10, 20);
		assertEquals(200, result);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {10, 20, 25, 100})
	public void squareTest(int num1){
		
		int result = calc.square(num1);
		assertEquals(num1 * num1 , result);
	}
	
	@ParameterizedTest
	@CsvSource({"10, 90", "50, 50", "20, 80"})
	public void paramAddTest(int num1, int num2){
		
		int result = calc.add(num1, num2);
		assertEquals(100,result);		
	}
	
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/input.csv" , nullValues = {"N/A", "NA", "-"})
	public void aggregateTest(ArgumentsAccessor args){
		System.out.println(args.getString(0) + " has only " + args.getInteger(3) + " sick days remaining.");
	}
}