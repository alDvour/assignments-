package Collections


fun main(){

    var duplicates= mutableListOf<String>("Ravi","Prash","Divya","Maosan","Divya","Bulbul","dev")
    println(duplicates)

    var removeDuplicate=duplicates.toSet()
    println("After removing duplicate: $removeDuplicate")
}