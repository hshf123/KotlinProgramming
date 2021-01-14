package chap03.section5.crossinline

fun main(){
    shortFunc(3){
        println("First call: $it")
        //return문 사용불가 crossinlind 키워드
    }
}

inline fun shortFunc(a:Int,crossinline out:(Int)->Unit){
    println("Before calling out()")
    nestedFunc{out(a)}
    println("After calling out()")
}

fun nestedFunc(body:()->Unit){
    body()
}