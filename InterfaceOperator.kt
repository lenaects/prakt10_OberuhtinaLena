interface InterfaceOperator
{
    var name:String
    var price:Double
    var square:Double
    fun Q():Double
    {
       return (100*square)/price
    }
    fun info():String
    {
       return "оператор связи $name, стоимость минут составляет $price, плошаль покрытия $square и стоимость звонка ${Q()}"
    }

}