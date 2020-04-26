package com.skillbox.myhomework

fun main(){
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
                               //println(a)
                               b++
                           }
                         // println(a)
                           a?: continue
                }
            }
            ?: println("Вы ввели не число")
}