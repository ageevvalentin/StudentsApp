package architecture.domain

import kotlin.reflect.KProperty

abstract class BaseEntity<Identity : Any, Self : BaseEntity<Identity, Self>> :
    Entity<Identity, Self> {

    private var properties: MutableMap<KProperty<*>, Any?> = mutableMapOf()

    override var identity by property<Identity>()
        protected set

    protected abstract val factory: () -> Self

    override fun copy() = factory().apply {
        properties = properties.toMutableMap()
    }

    protected fun <Value> property() =
        Property<BaseEntity<Identity, Self>, Value>(
            properties
        )
}