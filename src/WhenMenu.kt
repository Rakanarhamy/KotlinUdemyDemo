fun main(args: Array<String>) {

    print("Choose number from the menu: ")
    val foodId : Int? = try {readLine()!!.toInt() } catch (e: NumberFormatException) { null }

    if (foodId != null) {

        when(foodId) {
            1 -> {
                print("You got sandwich")
            }
            2 -> {
                print("You got burger")
            }
            in 3..5 -> {
                print("You got hotdog, softdrink and fries")
            }
            else -> {
                print("You did not order anything")
            }
        }
    }
}