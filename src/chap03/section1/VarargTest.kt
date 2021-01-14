package chap03.section1

fun main(){
    normalVarargs(1,2,3)
    normalVarargs(1,2,3,4)
}

fun normalVarargs(vararg counts:Int){
    for(num in counts){
        println(num)
    }
}