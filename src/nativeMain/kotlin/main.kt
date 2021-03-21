import kotlin.math.sin
import kotlin.random.Random

fun sum(x: Int, y: Int):Int {
    return x + y
}
fun sous(x: Int, y: Int):Int {
    return x - y
}
fun main() {
    println("Vous souhaitez faire une addition ou une soustraction ?")
    val answer = readLine()
    if (answer == "addition"){
        val randomValues = Random.nextInt(0, 100)
        val randomValues2 = Random.nextInt(0, 100)

        print("Nombres choisis : ")
        print(randomValues)
        print(" et ")
        println(randomValues2)
        print(randomValues)
        print(" + ")
        print(randomValues2)
        print(" = ")
        println(sum(randomValues, randomValues2))
        println(main())
    }else if (answer == "soustraction") {
        val randomValues3 = Random.nextInt(100, 200)
        val randomValues4 = Random.nextInt(0, 100)

        print("Nombres choisis : ")
        print(randomValues3)
        print(" et ")
        println(randomValues4)
        print(randomValues3)
        print(" - ")
        print(randomValues4)
        print(" = ")
        println(sous(randomValues3, randomValues4))
        println(main())
    }else if (answer == "rien") {
        println("Good bye...")
    }else if (answer == "help") {
        println("Si vous souhaitez faire une addition random écrivez")
        println("addition")
        println(" ")
        println("Si vous souhaitez faire une soustraction random écrivez")
        println("soustraction")
        println(" ")
        println("Pour quittez le script écrivez")
        println("rien")
        println(main())
    }else{
        println("Il faut choisir !")
        println(main())
    }
}