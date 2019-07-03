package architecture.domain

interface Entity<Identity : Any, Self : Entity<Identity, Self>> {
    val identity: Identity

    fun copy(): Self
}