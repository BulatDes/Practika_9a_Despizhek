package Films
import java.time.LocalTime
open class Cinema(var name:String,var pricetik: Int,var zal:Int,var seans:LocalTime,var countpos:Int) {
    open public fun Info(){
        println("На фильм '${name}' пришли ${countpos} посетителей")
    }
    public open fun Info2(){
        println("Фильм идет с '$seans' в зале $zal")
    }
    open public fun Sumfilm(){
        var sum:Int
        sum=pricetik*countpos
        println("${sum} денег заработал фильм за этот сеанс")
    }
}