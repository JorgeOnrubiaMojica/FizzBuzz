import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals

internal class FizzBuzzShould {

    private lateinit var fizzBuzz: FizzBuzz

    @BeforeEach
    fun createFizzBuzz(){
        this.fizzBuzz = FizzBuzz()
    }

    @Test
    fun `returns the number if the number is 1`(){
        assertEquals("1", fizzBuzz.getOutput("1"))
    }

    @ParameterizedTest
    @ValueSource(strings = ["3", "6", "9"])
    fun `return Fizz if number is divisible by 3`(number: String){
        assertEquals("Fizz", fizzBuzz.getOutput(number))
    }

    @ParameterizedTest
    @ValueSource(strings = ["5", "10"])
    fun `return Buzz if number is divisible by 5`(number: String) {
        assertEquals("Buzz", fizzBuzz.getOutput(number))
    }

    @ParameterizedTest
    @ValueSource(strings = ["15", "30", "45"])
    fun `return FizzBuzz if number is divisible by 3 and 5 `(number: String) {
        assertEquals("FizzBuzz", fizzBuzz.getOutput(number))
    }

    @ParameterizedTest
    @ValueSource(strings = ["2", "4", "41"])
    fun `return the number himself if number is not divisible by 3 and not divisible by 5 `(number: String) {
        assertEquals(number, fizzBuzz.getOutput(number))
    }


}