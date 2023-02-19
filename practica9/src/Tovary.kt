package Tovar
open class Tovary(var name:String,var price:Double,var edizm:String,var vid:String,var count:Int) {
    public open fun Info(){
        println("Название товара: $name")
        println("Цена товара: $price")
        println("Вид товара: $vid")
        println("Кол-во товара: $count")
    }
}