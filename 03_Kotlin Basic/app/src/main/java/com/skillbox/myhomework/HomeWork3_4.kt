package com.skillbox.myhomework

import java.lang.reflect.Array

fun main (){
    print("Введите число: ")
    val n: Int = readLine()?.toIntOrNull() ?: return
    //println(n)
    println("Список значений: ${readInt(n)}")

}

fun readInt(n: Int):List<Int> {
    var b = 0
    val arrayList = mutableListOf<Int>()
    println("Введите $n чисел")
    while (b < n)
    {
        // println("Введите целое число")
        val a = readLine()?.toIntOrNull()
        a?.let{
            arrayList.add(a)
            //println(a)
            b++
        }
        // println(a)
        a?: continue
    }
    return arrayList
}
