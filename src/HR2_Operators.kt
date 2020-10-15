import java.util.*
import kotlin.io.*
import kotlin.math.roundToInt
import kotlin.text.*

// Complete the solve function below.
fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    val tip:Double = meal_cost * (tip_percent.toFloat()/100)
    val tax:Double = meal_cost * (tax_percent.toFloat()/100)
    val totalCost:Double = meal_cost + tip + tax
    println("${tip}")
    println("${tax}")
    println("${totalCost}")
    println("${totalCost.roundToInt()}")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val meal_cost = scan.nextLine().trim().toDouble()
    val tip_percent = scan.nextLine().trim().toInt()
    val tax_percent = scan.nextLine().trim().toInt()
    solve(meal_cost, tip_percent, tax_percent)
}
