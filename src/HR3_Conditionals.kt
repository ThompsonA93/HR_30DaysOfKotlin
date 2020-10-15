
import java.util.*
import kotlin.io.*
import kotlin.text.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt()

    if(!even(N)){
        println("Weird")
    }
    if(even(N) && N >= 2 && N <= 5){
        println("Not Weird")
    }
    if(even(N) && N >= 6 && N <= 20){
        println("Weird")
    }
    if(even(N) && N > 20){
        println("Not Weird")
    }

}

fun even(value: Int) : Boolean {
    if(value % 2 == 0){
        return true
    }
    return false
}
