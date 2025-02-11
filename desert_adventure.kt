fun main() {
    greetTraveller()
    println(findOasis(10, 20))
}

fun greetTraveller() {
    println("Welcome to the Desert, Traveller!")
}

fun findOasis(x: Int, y: Int): String {
    return "Oasis found at coordinates ($x, $y)"
}