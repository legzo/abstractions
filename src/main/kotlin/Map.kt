fun main() {

    println("For ... in")
    val input = listOf(1, 2, 3)
    val output = mutableListOf<Int>()
    for (number in input) {
        output.add(number * 2)
    }
    println("With for..in :\n $input -> $output")

    /*

        88,dPYba,,adPYba,   ,adPPYYba,  8b,dPPYba,
        88P'   "88"    "8a  ""     `Y8  88P'    "8a
        88      88      88  ,adPPPPP88  88       d8
        88      88      88  88,    ,88  88b,   ,a8"
        88      88      88  `"8bbdP"Y8  88`YbbdP"'
                                      88
                                      88

        Iterable<T>.map(transform: (T) -> R): List<R>

        Je prends une collection de trucs et je transforme chaque truc en un machin
        ==> j'obtiens une collection de machins

        Le lambda est une transformation

        fonctionne avec une transformation T -> T a fortiori

    */

    val doubles = listOf(1, 2, 3)
        .map { number -> number * 2 }

    println("With explicit param :\n $input -> $doubles")


    val alsoDoubles = listOf(1, 2, 3)
        .map { it * 2 }

    println("With implicit param :\n $input -> $alsoDoubles")


    val letters = setOf("A", "B", "A")

    val lowercases = letters
        .map { it.toLowerCase() }

    println("With letters :\n $letters -> $lowercases")


    // mais aussi avec une transformation T -> R

    val countries = setOf("Antigua and Barbuda", "Brazil", "Cambodia", "Denmark", "Egypt")

    val letterCounts = countries
        .map { it.length }

    println("With other type :\n $countries -> $letterCounts")


    val ints = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val evenStates = ints
        .map { it % 2 == 0 }

    println("With booleans :\n $ints -> $evenStates")


    println("\n👏")

    /*

    Exemples :

    1. Pour chaque id de produit, je vais aller chercher le produit en base de donnée, ou dans le catalogue :
    👉 c'est un map : List<String> -> List<Produit>

    2. Je veux transformer une liste de produits en une liste de DTO pour passer à ma vue
    👉 c'est un map : List<Product> -> <ProductDto>

    3. Je veux afficher un sélecteur me permettant de filtrer sur les marques des produits que je renvoie à ma page
    👉 c'est un map : List<Product> -> <Marque> (avec un toSet() pour ne pas avoir de doublons)

    */

}
