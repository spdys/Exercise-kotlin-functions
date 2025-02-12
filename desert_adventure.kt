fun main() {
    greetTraveller()
    println(findOasis(10, 20))
    println(currentTemperature(25, 40))
    println(startCamelRide(10, 5))
    println(startCamelRide(10))
    println(exploreDune(climbRate = 3, height = 20))
}

fun greetTraveller() {
    println("Welcome to the Desert, Traveller!")
}

fun findOasis(x: Int, y: Int): String {
    return "Oasis found at coordinates ($x, $y)"
}

fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): String {
    return "Average Temperature: ${(morningTemperature+afternoonTemperature)/2}"
}

fun startCamelRide(time: Int, speed: Int = 5): String {
    return "Camel Ride: Distance ${time*speed} km, Speed = $speed km/h, Time = $time hours"
}

fun exploreDune(height: Int, climbRate: Int): String {
    var time: Double = height.toDouble()/climbRate.toDouble()
    return "Time to Climb the Dune: ${"%.2f".format(time)} hours"

}