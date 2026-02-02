val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
val solarSystem1 = rockPlanets + gasPlanets
val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

fun main(){
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystem.size)

    solarSystem["Pluto"] = 5

    println(solarSystem["Pluto"])
    println(solarSystem["Uranus"])
    println(solarSystem["Theia"])

    solarSystem.remove("Pluto")
    println(solarSystem.size)

    solarSystem["Jupiter"] = 82
    println(solarSystem["Jupiter"])





//    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
//    println(solarSystem.size)
//    solarSystem.add("Pluton")
//    println(solarSystem.size)
//    println(solarSystem.contains("Pluton"))
//    solarSystem.remove("Pluton")
//    println(solarSystem.size)
//    println(solarSystem.contains("Pluton"))




//    val solarSystem2 = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    println(solarSystem.indexOf("Pluto"))
//    println(solarSystem.indexOf("Venus"))
//    println()
//
//    solarSystem2.add("Pluto")
//
//    solarSystem2.add(0,"ABG")
//
//    solarSystem2.removeAt(0)
//
//    println(solarSystem2.contains("Pluto"))
//    println("Future Moon" in solarSystem2)
//    println()
//
//    for (planet in solarSystem2){
//
//        println(planet)
//    }
////    solarSystem[3] = "Litle Earth"
//    println()
//    println(newSolarSystem[8])
//
//    println()
//    println(solarSystem[0])
//    println(solarSystem[1])
//    println(solarSystem[2])
//    println(solarSystem[3])
//    println(solarSystem[4])
//    println(solarSystem[5])
//    println(solarSystem[6])
//    println(solarSystem[7])

}