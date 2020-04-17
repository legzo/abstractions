fun main() {

    val ints = listOf(1, 2, 3)
    val output = mutableListOf<Int>()
    for (number in ints) {
        if (number >= 2) {
            output.add(number)
        }
    }
    println("WIth for..in :\n $ints -> $output")

    /*
             ad88  88  88
            d8"    ""  88    ,d
            88         88    88
          MM88MMM  88  88  MM88MMM  ,adPPYba,  8b,dPPYba,
            88     88  88    88    a8P_____88  88P'   "Y8
            88     88  88    88    8PP"""""""  88
            88     88  88    88,   "8b,   ,aa  88
            88     88  88    "Y888  `"Ybbd8"'  88



        Iterable<T>.filter(predicate: (T) -> Boolean): List<T>

        Je prends une collection de trucs et je n'en retiens que les éléments
        vérifiant un certain prédicat

        Le lambda est un predicat, on reste sur le même type en entrée et en sortie

     */

    val bigNumbers = ints.filter { number -> number >= 2 }

    println("With explicit param :\n $ints -> $bigNumbers")



    val alsoBigNumbers = ints.filter { it >= 2 }

    println("With implicit param :\n $ints -> $alsoBigNumbers")


    val names = setOf("ABBA", "Batman", "Andrew Weatherall")
    val namesWithAllInIt = names.filter { it.contains("all") }

    println("With strings :\n $names -> $namesWithAllInIt")


    val intsToTen = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val eventIntsToTen = intsToTen.filter { it % 2 == 0 }

    println("With ints :\n $intsToTen -> $eventIntsToTen")


    println("\n👏")

    /*

    Exemples :

    1. N'afficher que les produits appartenant à une marque donnée.
    2. Permettre au client de sélectionner uniquement les points relais qui sont ouverts.

     */
}
