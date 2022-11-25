/**
 * Средняя (4 балла)
 *
 * Дата представлена строкой вида "15 июля 2016".
 * Перевести её в цифровой формат "15.07.2016".
 * День и месяц всегда представлять двумя цифрами, например: 03.04.2011.
 * При неверном формате входной строки вернуть пустую строку.
 *
 * Обратите внимание: некорректная с точки зрения календаря дата (например, 30.02.2009) считается неверными
 * входными данными.
 */
fun main (){
    var input = readLine().toString()
    var dataString = input
    var exemtion = false

    var dataArr = dataString.split(".").toMutableList()
    var month = dataArr[1]
    var day = dataArr[0]
    var year = dataArr[2]

    day = day.replace("0", "")
    month = month.replace("0", "")

    if (day.toInt()>31){
        exemtion = true
    }
    else if (month.toInt()>12){
        exemtion = true
    }

    month = month.replace("1", "января")
    month = month.replace("2", "февраля")
    month = month.replace("3", "марта")
    month = month.replace("4", "апреля")
    month = month.replace("5", "мая")
    month = month.replace("6", "июня")
    month = month.replace("7", "июля")
    month = month.replace("8", "августа")
    month = month.replace("9", "сентября")
    month = month.replace("10", "октября")
    month = month.replace("11", "ноября")
    month = month.replace("12", "декабря")

    dataString = ("$day $month $year")
    if (exemtion){
        println()
    }
    else {
        println("$dataString")
    }
}



