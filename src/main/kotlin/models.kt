import java.time.LocalDate

data class Product(val id: String, val name: String, val price: Int)

data class Discount(val amount: Int, val startDate: LocalDate, val endDate: LocalDate)

fun makeProducts(): List<Product> {
    TODO()
}
