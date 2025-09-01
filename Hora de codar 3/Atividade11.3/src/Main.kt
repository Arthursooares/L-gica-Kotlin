fun main() {
    println("Tabuadas de 1 a N")
   println("Digite um numero para ver sua tabuada de 1 a n:")
    val n = readLine()!!.toInt()
    for (num in 1..n)
    {
        println("Tabuada de $num: ")
        for (i in 1..10)
        {
            val resultado = num * i
            println("$num x $i = $resultado")
        }
    }
}