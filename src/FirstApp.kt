fun main(args: Array<String>) {
    swapTwoNumbersWithoutTemp()
}

fun swapTwoNumbersWithoutTemp() {
    var a:Int=25
    var b:Int=20
    println("Number1 = $a ,  Number2 = $b")
    a=a+b
    b=a-b
    a=a-b
    println("Number1 = $a ,  Number2 = $b")
}

