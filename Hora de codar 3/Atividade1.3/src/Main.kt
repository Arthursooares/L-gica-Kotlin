fun main() {
    for (i in 30 downTo 0) {
        println(i)
        Thread.sleep(1000)
    }
    println("EXPLOSÃO")
}