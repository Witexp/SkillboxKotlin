package com.skillbox.myhomework

fun main (){
    //Android разработчик уровень 1. Домашняя работа  3.17 - 1
    print("Введите число: ")
    val n: Int = readLine()?.toIntOrNull() ?: return
    val arrayList: MutableList<Int> = mutableListOf()

    //Android разработчик уровень 1. Домашняя работа  3.17 - 3
    arrayList.addAll(readIntSimb6(n))
    println("Список значений: ${arrayList}")

    //Android разработчик уровень 1. Домашняя работа  3.17 - 5
    println("Колличество положительных чисел в списке: ${checkPos6(arrayList)}")

    //Android разработчик уровень 1. Домашняя работа  3.17 - 6
    val evenNumber = arrayList.filter{it%2 == 0 && it != 0}
    println("Вывод только четных чисел: ${evenNumber}")

    //Android разработчик уровень 1. Домашняя работа  3.17 - 7
    val unicNumber = arrayList.toSet()
    println("Колличество уникальных значений: ${unicNumber.size}")

    //Android разработчик уровень 1. Домашняя работа  3.17 - 8
    val sumNumberList = arrayList.sum()
    println("Сумма всех значений списка: $sumNumberList")

    //Android разработчик уровень 1. Домашняя работа  3.17 - 10
    val mutableMap = mutableMapOf<Int,Int>()

    //Android разработчик уровень 1. Домашняя работа  3.17 - 9
    for (i : Int in arrayList){
        val nodNum = gcd(sumNumberList,Math.abs(i))
        println("НОД чисел $sumNumberList и $i =  ${nodNum}")
        mutableMap.put(i,nodNum)
    }
    println("Map на основе числа и НОД: $mutableMap")

    //Android разработчик уровень 1. Домашняя работа  3.17 - 11
    for (key in mutableMap.keys ){
        println("Число <$key>, Сумма<$sumNumberList>, НОД <${mutableMap[key]}> ")
    }
}
//Android разработчик уровень 1. Домашняя работа  3.17 - 9
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
//Android разработчик уровень 1. Домашняя работа  3.17 - 5
fun  checkPos6(arrayListSimbol: List<Int>):Int{
    var posNum: Int = 0
    for(i: Int in arrayListSimbol){
        if(i >= 0) posNum++
    }
    return posNum
}
//Android разработчик уровень 1. Домашняя работа  3.17 - 2
fun readIntSimb6(n: Int):List<Int> {
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
