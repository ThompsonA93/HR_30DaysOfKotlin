import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the factorial function below.
fun factorial(n: Int): Int {
    if(n <= 1){
        return 1
    }else{
        return n*factorial(n-1)
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val result = factorial(n)
    println(result)
}
