import Tovar.*
class Bytovye (var name:String,var price:Double,var count:Int){
    public fun Skidka(){
        val rnd=(0..50).random()
        println("если купите сейчас будет скидка $rnd%")
    }

    public fun Dostavka(a:Double){
        if (a<0) println("Неправильный ввод")
        else {
            when (a) {
                in 0.0..1.0 -> println("Доставка бесплатная")
                in 1.1..3.0 -> println("Доставка 150 р.")
                in 3.1..8.0 -> println("Доставка 500 р.")
                else -> println("Мы не сможем к вам доставить")
            }
        }
    }
}