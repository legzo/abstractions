fun main() {

    val input = listOf(1, 2, 3, 4, 5)
    val iterator = input.iterator()
    var output = iterator.next()
    while (iterator.hasNext()) {
        output += iterator.next()
    }

    println("With iterator :\n $input -> $output")

    /*

                                         88
                                         88
                                         88
        8b,dPPYba,   ,adPPYba,   ,adPPYb,88  88       88   ,adPPYba,   ,adPPYba,
        88P'   "Y8  a8P_____88  a8"    `Y88  88       88  a8"     ""  a8P_____88
        88          8PP"""""""  8b       88  88       88  8b          8PP"""""""
        88          "8b,   ,aa  "8a,   ,d88  "8a,   ,a88  "8a,   ,aa  "8b,   ,aa
        88           `"Ybbd8"'   `"8bbdP"Y8   `"YbbdP'Y8   `"Ybbd8"'   `"Ybbd8"'


        Iterable<T>.flatMap(transform: (T) -> Iterable<R>): List<R>

        Je prends une collection de trucs, je transforme chaque truc en une liste de machins et ensuite je mets tout à
        plat ==> j'obtiens une liste de tous les machins

        Le lambda est une transformation vers une liste

    */


    val outputWithLambda =
        listOf(1, 2, 3, 4, 5)
            .reduce { acc, number -> acc + number }

    println("Reduce with lambda :\n $input -> $outputWithLambda")

    val outputWithMethodRef = listOf(1, 2, 3, 4, 5)
        .reduce(Int::plus)

    println("Reduce with method reference :\n $input -> $outputWithMethodRef")

    println("\n👏")

    /*

    Exemples :

    1.

     */
}