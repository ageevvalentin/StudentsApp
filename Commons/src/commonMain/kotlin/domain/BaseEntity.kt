package domain

import kotlin.reflect.KProperty

abstract class BaseEntity<Identity : Any, Self : BaseEntity<Identity, Self>> :
    Entity<Identity, Self> {

    private var properties: MutableMap<KProperty<*>, Any?> = mutableMapOf()

    override lateinit var identity: Identity
        protected set

    abstract val factory: () -> Self

    override fun copy() = factory().apply {
        properties = properties.toMutableMap()
    }

    fun <T : Any?> property(defaultValue: T? = null) =
        Property<BaseEntity<Identity, Self>, T>(properties)
}