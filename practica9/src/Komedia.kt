import Films.*
class Komedia(var name:String,var ocenka:Double,var countves:Int) {
    public fun Ocenka(a:Double){
        when(a) {
            in  0.0..3.9 -> println("Фильм плохой")
            in 4.0..5.9-> println("Фильм неплохой")
            in 6.0..8.9->println("Фильм хороший")
            in 9.0..10.0->println("Фильм отличный")
            else->println("Неверная оценка")
        }
    }

    public fun Count(a:Int){
        when(a){
            in 0..2-> println("Фильм не смешной")
            in 3..6->println("Фильм чуть-чуть смешной")
            in 7..10-> println("Фильм смешной")
            else->println("Фильм очень смешной,стоит его посмотреть")
        }
    }
}