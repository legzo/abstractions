fun main() {

    println("For ... in")
    val input = listOf("Ernesto", "Guevara")
    val output = mutableListOf<Char>()
    for(prenom in input) {
        output.addAll(prenom.toList())
    }
    println("With for..in :\n $input -> $output")

    /*

           ad88  88
          d8"    88                ,d
          88     88                88
        MM88MMM  88  ,adPPYYba,  MM88MMM  88,dPYba,,adPYba,   ,adPPYYba,  8b,dPPYba,
          88     88  ""     `Y8    88     88P'   "88"    "8a  ""     `Y8  88P'    "8a
          88     88  ,adPPPPP88    88     88      88      88  ,adPPPPP88  88       d8
          88     88  88,    ,88    88,    88      88      88  88,    ,88  88b,   ,a8"
          88     88  `"8bbdP"Y8    "Y888  88      88      88  `"8bbdP"Y8  88`YbbdP"'
                                                                          88
                                                                          88

        Iterable<T>.flatMap(transform: (T) -> Iterable<R>): List<R>

        Je prends une collection de trucs, je transforme chaque truc en une liste de machins et ensuite je mets tout à
        plat ==> j'obtiens une liste de tous les machins

        Le lambda est une transformation vers une liste

    */

    val outputWithFlatMap = listOf("Ernesto", "Guevara")
        .flatMap { it.toList() }

    // List<String> -> List<Char>
    println("With flatMap :\n $input -> $outputWithFlatMap")



    // Sans flatMap :
    // List<String> -> List<List<Char>>

    val outputWihMapOnly = listOf("Ernesto", "Guevara")
        .map { it.toList() }

    println("With map only :\n $input -> $outputWihMapOnly")


    println("\n👏")

    /*

    Exemples :

    1. Récupérer toutes les discounts associées aux produits dans le panier du client :
    👉 c'est un flatMap : List<Produit> -> List<Discount>

    2. Je veux afficher un sélecteur me permettant de filtrer sur les catégories des produits que je renvoie à ma page,
    un produit peut être associé à plusieurs catégories :
    👉 c'est un flatMap : List<Produit> -> Set<Categorie> (avec un toSet() pour supprimer les doublons)

     */
}