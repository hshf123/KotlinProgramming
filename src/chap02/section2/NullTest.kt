package chap02.section2

fun main(){
    var str1:String? = "Hello"
    str1 = null
    val len = if(str1 != null) str1.length else 3 // == ${str1?.length ?: 3}
    println("$len")
}