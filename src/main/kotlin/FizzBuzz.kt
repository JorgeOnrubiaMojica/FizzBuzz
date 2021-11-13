class FizzBuzz {
    fun getOutput(number: String): String {
        return if (number.toInt() == 1){
            number
        } else if (number.toInt() == 3){
            "Fizz"
        } else{
            "Buzz"
        }

    }
}
