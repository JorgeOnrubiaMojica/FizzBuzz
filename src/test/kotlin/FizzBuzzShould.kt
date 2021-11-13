import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
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

    @Test
    fun `return Fizz if number is divisible by 3`(){
        assertEquals("Fizz", fizzBuzz.getOutput("3"))
    }

    @Test
    fun `return FizzBuzz if number is divisible by 5`(){
        assertEquals("Buzz", fizzBuzz.getOutput("5"))
    }
}