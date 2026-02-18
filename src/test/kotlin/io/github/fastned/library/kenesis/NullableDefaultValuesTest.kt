package io.github.fastned.library.kenesis

import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class NullableDefaultValuesTest {
    @Test
    fun `Should not generate nullable parameters by default`() {
        val generated = kenesis<ClassWithNullables>(
            useDefaultValues = false,
        )
        assertNotNull(generated.string)
        assertNotNull(generated.int)
        assertNotNull(generated.list)
    }

    @Test
    fun `Should generate nullable parameters if specified`() {
        val generated = kenesis<ClassWithNullables>(
            generateNullables = false,
            useDefaultValues = false,
        )
        assertNull(generated.string)
        assertNull(generated.int)
        assertNull(generated.list)
    }

    @Test
    fun `Should generate nullable parameters also for subclasses`() {
        val generated = kenesis<ClassWithNullables>(
            generateNullables = true,
            useDefaultValues = false,
        )
        assertNotNull(generated.subclass)
        assertNotNull(generated.subclass.subString)
        assertNotNull(generated.subclass.subInt)
        assertNotNull(generated.subclass.subList)
    }

    data class ClassWithNullables(
        val string: String? = null,
        val int: Int? = null,
        val list: List<String>? = null,
        val subclass: SubclassWithNullables? = null,
    )

    data class SubclassWithNullables(
        val subString: String? = null,
        val subInt: Int? = null,
        val subList: List<String>? = null,
    )
}
