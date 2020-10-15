import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()

    for(x in 1..10){
        println("${n} x ${x} = ${n*x}")
    }
}