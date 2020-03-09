fun main() {

    // Iterable<T>.map(transform: (T) -> R): List<R>

    // Je prends une collection de trucs et je transforme chaque truc en un machin
    // ==> j'obtiens une collection de machins

    // Le lambda est une transformation

    // fonctionne avec une transformation T -> T a fortiori

    listOf(1, 2, 3)
        .map { number -> number * 2 }

    listOf(1, 2, 3)
        .map { it * 2 }

    setOf("A", "B", "A")
        .map { it.toLowerCase() }

    // mais aussi avec une transformation T -> R

    setOf("Antigua and Barbuda", "Brazil", "Cambodia", "Denmark", "Egypt")
        .map { it.length }

    listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        .map { it % 2 == 0 }

}
