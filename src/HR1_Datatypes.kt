// Not Available in Kotlin

import java.util.*

val s:String = "Hackerrank"

fun main(){

    val read: Scanner = Scanner(System.`in`)

    println("Enter an Integer.")
    var num_int = read.nextInt()

    println("Enter a float.")
    var num_float = read.nextFloat()


    println("Enter a String")
    var string = read.nextLine()


    println(num_int + num_float)
    println(num_float + num_float)
    println(s + string)
}
