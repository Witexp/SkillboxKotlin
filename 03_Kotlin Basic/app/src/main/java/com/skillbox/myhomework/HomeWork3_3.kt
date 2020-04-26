package com.skillbox.myhomework

fun main(){
    val arrayList = mutableListOf<Int>()
    var b: Int = 0
    println("Введите число: ")
    readLine()?.toIntOrNull()
            ?.let {
                println("Вы ввели число $it")
                println("Введите $it чисел")
                while (b < it)
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
            }
            ?: println("Вы ввели не число")
    println("Список значений $arrayList")
}