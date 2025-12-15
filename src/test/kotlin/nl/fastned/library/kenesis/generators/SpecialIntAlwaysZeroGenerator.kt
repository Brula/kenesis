package nl.fastned.library.kenesis.generators

import nl.fastned.library.kenesis.CustomProviderTest
import nl.fastned.library.kenesis.config.KenesisGenerator

class SpecialIntAlwaysZeroGenerator : KenesisGenerator<CustomProviderTest.SpecialIntAlwaysZero> {
    override fun generate(): CustomProviderTest.SpecialIntAlwaysZero {
        return CustomProviderTest.SpecialIntAlwaysZero(0)
    }
}
