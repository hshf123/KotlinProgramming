package chap03.section4

import java.util.concurrent.locks.ReentrantLock
//공유변수
var sharable = 1

fun main(){
    val reLock = ReentrantLock()
    lock(reLock,{criticalFunc()})
    lock(reLock){ criticalFunc()}
    lock(reLock,::criticalFunc)

    println(sharable)
}
//공유함수
fun criticalFunc(){
    sharable+=1
}

fun <T> lock(reLock:ReentrantLock, body:()->T):T{

    reLock.lock()
    try{
        return body()
    }finally {
        //잠금해제
        reLock.unlock()
    }
}