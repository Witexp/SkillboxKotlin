package com.skillbox.myhomework

fun main (){
    print("Введите число: ")
    val n: Int = readLine()?.toIntOrNull() ?: return
    val arrayList: MutableList<Int> = mutableListOf()
    arrayList.addAll(readIntSimb(n))

    println("Список значений: ${arrayList}")
    println("Колличество положительных чисел в списке: ${checkPos(arrayList)}")

}
fun  checkPos(arrayListSimbol: List<Int>):Int{
    var posNum: Int = 0
    for(i: Int in arrayListSimbol){
        if(i >= 0) posNum++
    }
    return posNum
}

fun readIntSimb(n: Int):List<Int> {
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
