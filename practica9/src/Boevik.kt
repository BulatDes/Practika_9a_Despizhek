import Films.*
class Boevik(var name:String,var ocenka:Double,var countepic:Int) {
  public  fun Ocenka(a:Double){
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
            in 0..2-> println("Фильм не интересный")
            in 3..6->println("Фильм чуть-чуть интересный")
            in 7..10-> println("Фильм интересный")
            else->println("Фильм очень интересный, стоит его посмотреть")
        }
    }
}