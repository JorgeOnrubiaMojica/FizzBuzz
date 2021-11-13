class FizzBuzz {
    fun getOutput(number: String): String {
        return if (isDivisibleBy3(number)){
            "Fizz"
        } else if (isDivisibleBy5(number)){
            "Buzz"
        } else {
            number
        }


    }

    private fun isDivisibleBy5(number: String) = (number.toInt() % 5) == 0

    private fun isDivisibleBy3(number: String) = (number.toInt() % 3) == 0
}
