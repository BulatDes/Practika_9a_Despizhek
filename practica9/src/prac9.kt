import java.time.LocalTime
import Films.Cinema as NewCinema
import Tovar.Tovary as NewTovary
fun main (){
    /*try {
        println("Введите название фильма")
        var name: String
        name = readLine().toString()
        println("Введите жанр фильма")
        var janr:String = readLine().toString()
        println("Оцените фильм по 10-ти бальной шкале")
        var ocenka: Double = readln().toDouble()
        when{
            (ocenka<0)->throw Exception("Такой оценки не может быть")
            (ocenka>=11)->throw Exception("Такой оценки не может быть")
        }
        println("Введите сколько было 'интересных моментов' (Это нам нужно для того, чтобы рекомендовать этот фильм другим будущим зрителям)")
        var countmoment:Int= readLine()!!.toInt()
        if(countmoment<0){throw Exception("моменты не могут быть отрицатеьными")}
        when(janr.lowercase()){
            "ужасы"->{
               var Film = Uzhasy(name,ocenka,countmoment)
                Film.Ocenka(ocenka)
                Film.Count(countmoment)
            }
            "боевик"->{
               var Film= Boevik(name,ocenka,countmoment)
                Film.Ocenka(ocenka)
                Film.Count(countmoment)
            }
            "комедия"->{
               var Film= Komedia(name,ocenka,countmoment)
                Film.Ocenka(ocenka)
                Film.Count(countmoment)
            }
            "драма"->{
                var Film = Drama(name,ocenka,countmoment)
                Film.Ocenka(ocenka)
                Film.Count(countmoment)
            }
            else->println("Извините у нас пока что нет такого жанра")

        }
        val rnd=(0..125).random()
        var countpos:Int=rnd
        val rnd1=(1..12).random()
        var zal:Int=rnd1
        val rnd2=(150..500).random()
        var pricetik:Int=rnd2
        var seans:LocalTime= LocalTime.now()
        var Film1=NewCinema(name,pricetik,zal,seans,countpos)
        Film1.Info()
        Film1.Info2()
        Film1.Sumfilm()
    }catch (ex:Exception){
            println(ex.message)
        }*/

        //zad13
    try{
        println("Введите название товара")
        var nametov:String= readLine().toString()
        println("Введите вид товара")
        var vid:String= readLine().toString()
        println("Введите цену товара")
        var price:Double= readln().toDouble()
        if(price<0){throw Exception("Неправильный ввод")}
        println("Введите количество товара")
        var count:Int= readln().toInt()
        if(count<0){throw Exception("Неправильный ввод")}
        println("Введите единицу измерения")
        var edizm:String= readLine().toString()
        when(vid.lowercase()){
            "бытовой"-> {
                val Tovar1 = Bytovye(nametov, price, count)
                Tovar1.Skidka()
                println("Введите расстояние до своего дома в км")
                var km:Double= readln().toDouble()
                Tovar1.Dostavka(km)
            }
            "еда"->{
                val Tovar1 = Eda(nametov, price, count)
                println("Введите калорийность продукта в килокалориях")
                var calor:Double= readln().toDouble()
                Tovar1.Calorii(calor)
                Tovar1.Poleznost(calor)
            }
            else->println("Пока что этот вид товара у нас отсутствует")
        }
        val Tovar2=NewTovary(nametov,price,edizm,vid,count)
        Tovar2.Info()

    }catch (ex:Exception){
        println(ex.message)
    }
}