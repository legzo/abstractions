fun <T, R> Iterable<T>.map(transform: (T) -> R): List<R> {
    val result = mapTo(ArrayList(10), transform)
    println("$this -> $result")
    return result
}

fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    val result = filterTo(ArrayList<T>(), predicate)
    println("$this -> $result")
    return result
}