// Not available in Kotlin
class Person (initialAge:Int) {
    var age:Int

    init{
        if(initialAge > 0){
            age = initialAge
        }else{
            age = 0
            println("Age is not valid")
        }
    }
    fun yearPasses(){
        age++
    }
    fun amIOld(){
        if(age < 13){
            println("You are young.")
        }else if(age >= 13 && age <= 18){
            println("You are a teenager.")
        }else{
            println("You are old.")
        }
    }
}

fun main(){
    val p1:Person = Person(12)

    p1.amIOld()
    p1.yearPasses()
    p1.amIOld()

    val p2:Person = Person(18)
    p2.amIOld()
    p2.yearPasses()
    p2.amIOld()
}