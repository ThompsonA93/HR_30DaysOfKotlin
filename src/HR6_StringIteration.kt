import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val N = scan.nextLine().trim().toInt()

    for(x in 1 .. N){
        var s:String = scan.nextLine()
        for (i in 0..s.length-1 step 2) {
            print(s[i])
        }
        print(" ")
        for(j in 1 .. s.length-1 step 2){
            print(s[j])
        }
        println("")
    }
}