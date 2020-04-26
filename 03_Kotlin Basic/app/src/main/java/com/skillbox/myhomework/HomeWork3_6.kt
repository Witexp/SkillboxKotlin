package com.skillbox.myhomework

fun main (){
    print("Введите число: ")
    val n: Int = readLine()?.toIntOrNull() ?: return
    val arrayList: MutableList<Int> = mutableListOf()
    arrayList.addAll(readIntSimb6(n))

    println("Список значений: ${arrayList}")
    println("Колличество положительных чисел в списке: ${checkPos6(arrayList)}")
    val evenNumber = arrayList.filter{it%2 == 0 && it != 0}
    println("Вывод только четных чисел: ${evenNumber}")

    val unicNumber = arrayList.toSet()
    println("Колличество уникальных значений: ${unicNumber.size}")

    val sumNumberList = arrayList.sum()
    println("Сумма всех значений списка: $sumNumberList")

}
fun  checkPos6(arrayListSimbol: List<Int>):Int{
    var posNum: Int = 0
    for(i: Int in arrayListSimbol){
        if(i >= 0) posNum++
    }
    return posNum
}

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
