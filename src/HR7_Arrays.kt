import java.util.*
import kotlin.collections.*
import kotlin.text.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    for(x in n-1 downTo 0){
        print("${arr[x]} ")
    }
}