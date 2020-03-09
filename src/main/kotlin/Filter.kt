fun main() {

    // Iterable<T>.filter(predicate: (T) -> Boolean): List<T>

    // Je prends une collection de trucs et je n'en retiens que les éléments
    // vérifiant un certain prédicat

    // Le lambda est un predicat, on reste sur le même type en entrée et en sortie

    listOf(1, 2, 3)
        .filter { number -> number >= 2 }

    listOf(1, 2, 3)
        .filter { it >= 2 }

    setOf("ABBA", "Batman", "Andrew Weatherall")
        .filter { it.contains("all") }

    listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        .filter { it % 2 == 0 }

}
