package architecture.domain

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

@Suppress("UNCHECKED_CAST")
class Property<Owner, Value>(
    private val map: MutableMap<KProperty<*>, Any?>
) : ReadWriteProperty<Owner, Value> {
    override fun getValue(thisRef: Owner, property: KProperty<*>) =
        if (map.containsKey(property)) {
            map[property] as Value
        } else {
            throw IllegalStateException("Property ${property.name} should be initialized.")
        }

    override fun setValue(thisRef: Owner, property: KProperty<*>, value: Value) {
        map[property] = value
    }
}