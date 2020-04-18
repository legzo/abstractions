fun main() {

    val input = listOf(1, 2, 3, 4, 5)
    val iterator = input.iterator()
    var output = iterator.next()
    while (iterator.hasNext()) {
        output += iterator.next()
    }

    println("With iterator :\n $input -> $output")
    println()

    /*

                                         88
                                         88
                                         88
        8b,dPPYba,   ,adPPYba,   ,adPPYb,88  88       88   ,adPPYba,   ,adPPYba,
        88P'   "Y8  a8P_____88  a8"    `Y88  88       88  a8"     ""  a8P_____88
        88          8PP"""""""  8b       88  88       88  8b          8PP"""""""
        88          "8b,   ,aa  "8a,   ,d88  "8a,   ,a88  "8a,   ,aa  "8b,   ,aa
        88           `"Ybbd8"'   `"8bbdP"Y8   `"YbbdP'Y8   `"Ybbd8"'   `"Ybbd8"'


        Iterable<T>.reduce(operation: (acc: T, T) -> T): T

        En vrai : <S, T : S> Iterable<T>.reduce(operation: (acc: S, T) -> S): S
        -> l'accumulateur peut être un super type du type des items de la collection source.

        Je prends une collection de trucs, pour chacun des trucs je vais appliquer une fonction d'accumulation (à
        prendre au sens le plus large possible) qui va retourner 1 seul truc.

    */


    val outputWithLambda =
        listOf(1, 2, 3, 4, 5)
            .reduce { acc, number -> acc + number }

    println("Reduce with lambda :\n $input -> $outputWithLambda")
    println()

    val outputWithMethodRef = listOf(1, 2, 3, 4, 5)
        .reduce(Int::plus)

    println("Reduce with method reference :\n $input -> $outputWithMethodRef")
    println()

    val alicante = listOf(
        "Une orange sur la table",
        "Ta robe sur le tapis",
        "Et toi dans mon lit",
        "Doux présent du présent",
        "Fraîcheur de la nuit",
        "Chaleur de ma vie"
    ).reduce { acc, ligne -> "$acc\n$ligne" }

    println("Alicante de Jacques Prévert : \n$alicante")
    println()
    // voir aussi joinToString()


    println("\n👏")

    /*

    Exemples :

    1. Je peux avoir plusieurs promotions qui s'appliquent sur un produit. Pour avoir le prix de mon produit une fois
    que toutes les promotions ont été appliquées, je peux "reduce" les montants de mes discounts.

    👉 val totalDesRemises = monProduit
                                .discounts
                                .reduce { acc, discount -> acc + discount.amount }

     */
}