package nl.fastned.library.kenesis.config

import kotlin.reflect.KClass

interface BaseProvider {
    fun <T : Any> addProvider(kClass: KClass<T>, generator: () -> T)
}
