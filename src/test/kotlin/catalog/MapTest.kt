package catalog

import catalog.Brand.*
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class MapTest {

    @Disabled
    @Test
    fun `should get all catalog product names`() {
        CatalogService.getProductNames() shouldBe listOf(
            "iPhone 7",
            "iPhone 11",
            "Galaxy S20",
            "Galaxy A40",
            "Galaxy A70",
            "20 Pro",
            "P30",
            "P30 lite"
        )
    }

    @Disabled
    @Test
    fun `should get all catalog brands`() {
        CatalogService.getBrands() shouldBe setOf(Apple, Honor, Huawei, Samsung)
    }
}