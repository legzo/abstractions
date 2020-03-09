import Brand.*
import Catalog.Companion.galaxyA40
import Catalog.Companion.galaxyA70
import Catalog.Companion.galaxyS20
import io.kotlintest.should
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class FilterTest {

    @Test
    fun `should get all catalog brands`() {
        CatalogService.getProductsWithDiscounts() shouldBe listOf(galaxyA70)
    }

    @Test
    fun `should get all products of specified brand`() {
        CatalogService.getProductOfBrand(Samsung) shouldBe listOf(galaxyS20, galaxyA40, galaxyA70)
    }

}