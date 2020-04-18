fun main() {

    val input = listOf(1, 2, 3, 4, 5)

    var output = 30
    for (item in input) {
        output += item
    }

    println("With for..in :\n $input -> $output")
    println()

    /*

           ad88              88           88
          d8"                88           88
          88                 88           88
        MM88MMM  ,adPPYba,   88   ,adPPYb,88
          88    a8"     "8a  88  a8"    `Y88
          88    8b       d8  88  8b       88
          88    "8a,   ,a8"  88  "8a,   ,d88
          88     `"YbbdP"'   88   `"8bbdP"Y8


        Iterable<T>.fold(initial: R, operation: (acc: R, T) -> R): R

        Quasiment comme un reduce, avec en plus :

          - le point de départ de l'accumulation doit être passé en argument, ce n'est plus implicitement le premier
            item de la liste.
          - le type de l'accumulateur et des items de la collection n'ont aucun lien.

    */


    val outputWithLambda =
        listOf(1, 2, 3, 4, 5)
            .fold(30) { acc, number -> acc + number }

    println("Fold with lambda :\n $input -> $outputWithLambda")
    println()

    val outputWithLambdaAndOtherType =
        listOf(1, 2, 3, 4, 5)
            .fold("") { acc, number -> acc + number }

    println("Fold with lambda, initial String :\n $input -> $outputWithLambdaAndOtherType")
    println()


    val outputWithMethodRef = listOf(1, 2, 3, 4, 5)
        .fold(30, Int::plus)

    println("Fold with method reference :\n $input -> $outputWithMethodRef")
    println()

    val alicanteAsListOfStrings = listOf(
        "Une orange sur la table",
        "Ta robe sur le tapis",
        "Et toi dans mon lit",
        "Doux présent du présent",
        "Fraîcheur de la nuit",
        "Chaleur de ma vie"
    )
    val alicante = alicanteAsListOfStrings
        .fold("Alicante, Jacques Prévert") { acc, ligne -> "$acc\n$ligne" }

    println("Un petit poême : \n$alicante")
    println()
    // voir aussi joinToString()


    val numberOfWordsInAlicante = alicanteAsListOfStrings
        .fold(0) { acc, ligne -> acc + nombreDeMots(ligne) }

    println("Nombre de mots total : $numberOfWordsInAlicante")
    println()

    println("\n👏")

    /*

    Exemples :

    1. Je peux avoir plusieurs promotions qui s'appliquent sur un produit. Pour avoir le prix de mon produit une fois
    que toutes les promotions ont été appliquées, je peux "fold" les montants de mes discounts en partant de mon prix
    sans promo :

    👉 val prixAvecPromos = monProduit
                                .discounts
                                .fold(prixSansPromo) { acc, discount -> acc - discount.amount }

    Je pars de mon prix sans promo et je soustrais chaque promo


     */
}

private fun nombreDeMots(ligne: String): Int {
    val nombreDeMots = ligne.split(' ').size
    println("  [$ligne -> $nombreDeMots mots]")
    return nombreDeMots
}