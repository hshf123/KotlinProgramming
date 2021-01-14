package chap02.section03

fun main(){
    val num = 256
    if(num is Int){
        print(num)
    } else if(num !is Int){
        print("Not a Int")
    }

    val x: Any
    x = "125"
    if (x is String){
        print(x)
    }
}