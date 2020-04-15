package catalog

import catalog.Brand.*
import java.time.LocalDate

enum class Brand { Apple, Honor, Huawei, OPPO, Samsung, Sony, Xiaomi, }

data class Catalog(val products: List<Product>) {

    companion object {
        private val oneYearAgo = LocalDate.now().minusYears(1)
        private val tenDaysAgo = LocalDate.now().minusDays(10)
        private val oneMonthFromNow = LocalDate.now().plusMonths(1)

        private val discountA70 = Discount(50, tenDaysAgo, oneMonthFromNow)
        private val oldDiscountA70 = Discount(50, oneYearAgo, tenDaysAgo)
        val galaxyA70 = Product(Samsung, "Galaxy A70", 349, discounts = listOf(oldDiscountA70, discountA70))
        val iphone7 = Product(Apple, "iPhone 7", 379)
        val iphone11 = Product(Apple, "iPhone 11", 799)
        val galaxyS20 = Product(Samsung, "Galaxy S20", 299)
        val galaxyA40 = Product(Samsung, "Galaxy A40", 259)
        val honor20Pro = Product(Honor, "20 Pro", 399)
        val huaweiP30 = Product(Huawei, "P30", 599)
        val huaweiP30Lite = Product(Huawei, "P30 lite", 259)

        fun get(): Catalog {
            return Catalog(
                listOf(
                    iphone7,
                    iphone11,
                    galaxyS20,
                    galaxyA40,
                    galaxyA70,
                    honor20Pro,
                    huaweiP30,
                    huaweiP30Lite
                )
            )
        }
    }

}

data class Product(
    val brand: Brand,
    val name: String,
    val price: Int,
    val discounts: List<Discount> = listOf()
)

data class Discount(
    val amount: Int,
    val startDate: LocalDate,
    val endDate: LocalDate
)


