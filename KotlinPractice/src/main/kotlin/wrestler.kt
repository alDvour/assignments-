class Wrestler(name: String,age: Int,height: Int, weight: Int){
  var name = name
    var age = age
   var height = height
   var weight = weight
}
fun main(){
   val wrestler = mutableListOf<Wrestler>()

       wrestler.add(Wrestler("Sunil",34, 168,66))
       wrestler.add(Wrestler("Mao",54, 178,66))
        wrestler.add(Wrestler("Sunil",23, 158,66))

        println("List of wrestlers age greater than 35")
        for(Wrestler in wrestler){
            if(Wrestler.age>35){
                println("${Wrestler.name}  ${Wrestler.age}")
            }
        }
        println("Wrestlers weight greater than 200")
        for(Wrestler in wrestler){
            if(Wrestler.weight>200){
                println("${Wrestler.name}  ${Wrestler.weight}")
            }
   }

}
