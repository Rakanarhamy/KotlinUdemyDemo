fun main(args: Array<String>) {
    print("Enter number: ")
    val number : Int? = try {readLine()!!.toInt() } catch (e: NumberFormatException) { null }

    print(if (number!!%2==0) "Number is Even" else "Number is Odd")
}