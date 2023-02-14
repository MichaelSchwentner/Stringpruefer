fun main() {
    println("Gebe bitte ein Wort ein um zu überprüfen ob im Wort gleich viele 'X' und 'O' vorkommen")
    val eingabeWort = readLine().toString()
    println(stringpruefer(eingabeWort))
    if (stringpruefer(eingabeWort) == false) {
        println("In dem eingegebenen Wort kommen nicht gleich viele 'O' und 'X' vor")
    } else {
        println("In dem eingegebenen Wort kommen gleich viele 'O' und 'X' vor!")
    }
}

fun stringpruefer(eingabe: String): Boolean {
    val nummerX = eingabe.count { it == 'X' || it == 'x' }
    val nummerO = eingabe.count { it == 'O' || it == 'o' }
    return nummerX == nummerO
}
