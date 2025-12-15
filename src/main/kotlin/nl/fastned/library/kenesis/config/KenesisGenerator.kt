package nl.fastned.library.kenesis.config

interface KenesisGenerator<T> {
    fun generate(): T
}
