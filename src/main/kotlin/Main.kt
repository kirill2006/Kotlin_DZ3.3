fun main(args: Array<String>) {
    val input = readLine()?.toInt()
    var number = Factorial(input)

    try {
    println(number.factorial(input))
    }
    catch (e: MyExemption)
    {
        println(e.myMessage)
    }
}

class Factorial (var num: Int?) {
    fun factorial(num: Int?): Long {
        if (num != null) {
            if (num > 0) {
                var result = 1L
                for (i in 2..num!!) result *= i
                return result 
            } else {
                throw MyExemption("Num is < 0")
            }
        }
        return TODO("Provide the return value")
    }
}


class MyExemption(val myMessage: String) : Exception() {

}
