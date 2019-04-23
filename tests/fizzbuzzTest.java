import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class fizzbuzzTest {
    @Test
    public void fizzBuzzConverterLeavesNormalNumbersAlone() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzz.convert(1));
    }

    @Test

    public void fizzBuzzConvertorMultiplesOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void fizzBuzzConverterMultiplesOfFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void fizzBuzzConverterMultiplesOfFifteen() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }
}
