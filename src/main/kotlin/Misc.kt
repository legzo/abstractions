fun main() {

    /*

                            88
                            ""

        88,dPYba,,adPYba,   88  ,adPPYba,   ,adPPYba,
        88P'   "88"    "8a  88  I8[    ""  a8"     ""
        88      88      88  88   `"Y8ba,   8b
        88      88      88  88  aa    ]8I  "8a,   ,aa
        88      88      88  88  `"YbbdP"'   `"Ybbd8"'


     */


    // Partition

    val (pairs, impairs) = (1..20).partition { it % 2 == 0 }

    println("Chiffres pairs : $pairs")
    println("Chiffres impairs : $impairs")
    println()



    // GroupBy

    val countries = setOf("Antigua and Barbuda", "Brazil", "France", "Denmark", "Egypt", "Poland", "Spain")
    val countriesGroupedByNameLength = countries.groupBy { it.length }

    println("Pays groupés par longueur du nom : \n$countriesGroupedByNameLength")

    // Et use case fréquent : groupingBy + eachCount
    val numberOfCountriesByNameLength = countries.groupingBy { it.length }.eachCount()
    println("Nombre de pays groupés par longueur du nom : \n$numberOfCountriesByNameLength")
    println()



    // Zip

    val password = "jujuIsDaBest"
    val guess = "jujuIsABoss"

    val result =
        password
            .zip(guess) { actualChar, guessChar -> actualChar == guessChar }

    println("Result : $result")

    val resultChars =
        password
            .zip(guess) { actualChar, guessChar -> if (actualChar == guessChar) guessChar else '*' }

    println("Résultat en lettres : $resultChars")

    val nombreDeCaracteresCorrects = result.count { it }
    println("Nombre de caractères corrects : $nombreDeCaracteresCorrects")

    // Existe aussi : zipWithNext
    val scoreCumule = listOf(0, 12, 15, 15, 19, 29, 34, 36, 48, 50)
    val scores = scoreCumule
        .zipWithNext { first, following -> following - first }
    println("Score de chaque lancer : $scores")
    println("On arrive bien à : ${scores.sum()} !")
    println()


    /*


     et plein d'autres :

       - takeWhile
       - chunked
       - distinct
       - scan
       - ...

     */




}