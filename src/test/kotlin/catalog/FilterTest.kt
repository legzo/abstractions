package catalog

import catalog.Brand.*
import catalog.Catalog.Companion.galaxyA40
import catalog.Catalog.Companion.galaxyA70
import catalog.Catalog.Companion.galaxyS20
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class FilterTest {

    @Disabled
    @Test
    fun `should get all catalog brands`() {
        CatalogService.getProductsWithDiscounts() shouldBe listOf(galaxyA70)
    }

    @Disabled
    @Test
    fun `should get all products of specified brand`() {
        CatalogService.getProductsOfBrand(Samsung) shouldBe listOf(galaxyS20, galaxyA40, galaxyA70)
    }

}