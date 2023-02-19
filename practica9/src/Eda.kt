import Tovar.*
class Eda (var name:String,var price:Double,var count:Int){
    public fun Calorii(a:Double){
        if(a<0){println("Неправильный ввод")}
        else {
            var km: Double
            km = a / 62
            println("Чтобы сжечь съеденные килокалории нужно пробежать ${km} километров")
        }
    }

    public fun Poleznost(a:Double){
        if(a<0){println("Неправильный ввод")}
        else{
            if(a>100) println("Еда вредная")
            else println("Еда полезная")
        }
    }


}