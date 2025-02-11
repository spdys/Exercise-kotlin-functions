fun main() {
    greetTraveller()
    println(findOasis(10, 20))
    println(currentTemperature(25, 40))
    println(startCamelRide(10, 5))
    println(startCamelRide(10))
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