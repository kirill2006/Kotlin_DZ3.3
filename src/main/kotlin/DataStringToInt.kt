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

    dataString = dataString.replace(" ", ".")
    dataString = dataString.replace("января", "01")
    dataString = dataString.replace("февраля", "02")
    dataString = dataString.replace("марта", "03")
    dataString = dataString.replace("апреля", "04")
    dataString = dataString.replace("мая", "05")
    dataString = dataString.replace("июня", "06")
    dataString = dataString.replace("июля", "07")
    dataString = dataString.replace("августа", "08")
    dataString = dataString.replace("сентября", "09")
    dataString = dataString.replace("октября", "10")
    dataString = dataString.replace("ноября", "11")
    dataString = dataString.replace("декабря", "12")

    var dataArr = dataString.split(".").toMutableList()
    var day = dataArr[0]
    var month = dataArr[1]

    if (dataArr[0].toInt()< 10){
        var dayZero = "0"
        dataArr[0] = dayZero + dataArr[0]
    }

    dataString = (dataArr[0] + "." + dataArr[1] + "." + dataArr[2])

    if (day.toInt()>31){
        println()
    }
    else if (month.toInt()>12){
        println()
    }
    else {
        println("Date: $dataString")
    }
}


