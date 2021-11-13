import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FizzBuzzShould {

    @Test
    fun `returns the number if the number is 1`(){
        val fizzBuzz = FizzBuzz()
        assertEquals("1", fizzBuzz.getOutput("1"))
    }

    @Test
    fun `return Fizz if number is divisible by 3`(){
        val fizzBuzz = FizzBuzz()
        assertEquals("Fizz", fizzBuzz.getOutput("3"))
    }
}