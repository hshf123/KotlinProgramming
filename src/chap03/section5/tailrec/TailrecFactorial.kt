package chap03.section5.tailrec

fun main(){
    val number = 4
    val result = factorial(number)
    println(result)
}

tailrec fun factorial(x:Int,run:Int=1):Long{
    return if (x==1) run.toLong() else factorial(x-1,run*x)
}