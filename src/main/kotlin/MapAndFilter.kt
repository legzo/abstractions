

fun main() {

    //<editor-fold desc="Intro">

    //<editor-fold desc="Map">
    //
    // Iterable<T>.map(transform: (T) -> R): List<R>
    //
    // Je prends une collection de trucs et je transforme chaque truc en un machin
    // ==> j'obtiens une collection de machins

    listOf(1, 2, 3).log()
        .map { number -> number * 2 }.log()

    listOf(1, 2, 3)
        .map { it * 2 }

    setOf("A", "B", "A")
        .map { it.toLowerCase() }


    //</editor-fold>

    //</editor-fold>


}

fun <T> T.log(): T {
    println(this)
    return this
}
