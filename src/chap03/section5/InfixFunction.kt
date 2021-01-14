package chap03.section5

fun main(){
    val multi = 3.multiply(10) // 3 multiply 10
    println(multi)
}

infix fun Int.multiply(x:Int):Int = this*x