// TODO

import java.util.*

var phoneBook : MutableList<Pair<String, String>> = arrayListOf()

fun main(){
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()

    for(x in 1 .. n){
        var readin = readLine()!!.split(" ")
        updatePhoneBook(readin[0], readin[1])
    }

    var query: String = readLine()!!
    while(query.isNotEmpty()){
        var entry: Pair<String, String>? = lookupPhoneBook(query)
        if (entry != null) {
            println("${entry.first}=${entry.second}")
        }else{
            println("Not found")
        }
        query = readLine()!!
    }
}

fun updatePhoneBook(name: String, number: String) {
    phoneBook.add(Pair(name, number))
}

fun lookupPhoneBook(name: String) : Pair<String, String>? {
    return phoneBook.firstOrNull { it.first == name }
}
