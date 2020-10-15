import java.util.*
import kotlin.text.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()

    val binary = Integer.toBinaryString(n)
    println(maxConsecutiveOnes(binary))
}

fun maxConsecutiveOnes(binary: String): Int {
    var maxOne = 0
    var tmpOne = 0
    for(i in 0 .. binary.length-1){
        if(binary[i] == '1'){
            tmpOne++
        }else{
            tmpOne = 0
        }

        if(tmpOne > maxOne){
            maxOne = tmpOne
        }
    }
    return maxOne
}
