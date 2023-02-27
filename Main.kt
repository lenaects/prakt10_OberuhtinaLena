fun main()
{
    println("Введите стоимость минут")
    var price= readLine()!!.toDouble()
    println("Введите площадь")
    var square= readLine()!!.toDouble()
    if(price>0&&square>0)
    {
        var tele2=Tele2("Tele2",price,square,true)
        println(tele2.Output())
    }
    else println("Значения не могут быть отрицательными")

    println("Введите стоимость минут")
    var price2= readLine()!!.toDouble()
    println("Введите площадь")
    var square2= readLine()!!.toDouble()
    if (price2>0&&square2>0)
    {
        var mts=MTS("MTS",price2,square2,false)
        println(mts.info())
    }
    else println("Значения не могут быть отрицательными")

}