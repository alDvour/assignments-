fun main() {

    for (i in 1..5) {
        var count = i
        for (j in 1 .. i) {

            print("$count")
            count -= 1

        }
        println(" ")
    }
}