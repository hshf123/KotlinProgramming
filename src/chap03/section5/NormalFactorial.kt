package chap03.section5

fun main(){
    val number = 4
    val result = factorial(number)
    println(result)
}

fun factorial(x:Int):Long{
    return if(x==1) x.toLong() else x* factorial(x-1)
}