import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals

internal class FizzBuzzShould() {

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
    fun `return FizzBuzz if number is divisible by 5`(number: String) {
        assertEquals("Buzz", fizzBuzz.getOutput(number))
    }


}