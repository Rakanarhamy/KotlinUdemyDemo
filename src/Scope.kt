

var name:String?=null

fun showUserInfo(){
    name="Welcome $name"
    println(" $name")

}


fun main(args: Array<String>) {
    name = "Hussein"
    println(" $name")
    showUserInfo()
    println(" $name")

}