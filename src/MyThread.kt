fun main(args: Array<String>) {
    var t1 = MyThread()
    t1.name = "T1"
    t1.start()

    var t2 = MyThread()
    t2.name = "T2"
    t2.start()

}

class MyThread(): Thread() {


    override fun start() {
        super.start()
        println("thread $name starts")
    }
    override fun run() {
        var count = 0

        while(count < 10) {
            println("thread $name Count: $count")
            count++
            try {
                Thread.sleep(1000)
            } catch (ex: Exception) {
                println(ex.message)
            }
        }
    }

}