package domain

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

@Suppress("UNCHECKED_CAST")
class Property<Owner : Any?, Value : Any?>(
    private val map: MutableMap<KProperty<*>, Any?>
) : ReadWriteProperty<Owner, Value> {
    override fun getValue(thisRef: Owner, property: KProperty<*>): Value =
        map[property] as Value

    override fun setValue(thisRef: Owner, property: KProperty<*>, value: Value) {
        map[property] = value
    }
}