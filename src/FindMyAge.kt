import java.util.*

fun main(args: Array<String>) {

    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    print("Enter Year of birth: ")
    val enteredYear : Int? = try {readLine()!!.toInt() } catch (e: NumberFormatException) { null }

    if (enteredYear != null) {
        val age = currentYear - enteredYear
        print("You are $age years old")
    }

}