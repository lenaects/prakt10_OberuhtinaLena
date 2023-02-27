class MTS( override var name:String,override var price:Double,override var square:Double,public var P:Boolean):InterfaceOperator
{
    override fun Q():Double {
        if (P==true)
            return 0.7*super.Q()
        else
            return 1.5*super.Q()
    }
    override fun info(): String
    {
        return "оператор связи $name, стоимость минут составляет $price, плошаль покрытия $square и стоимость звонка ${Q()}"
    }
}