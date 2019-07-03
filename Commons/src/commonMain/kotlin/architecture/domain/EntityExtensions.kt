package architecture.domain

inline fun <Identity : Any, Self : Entity<Identity, Self>>
    Entity<Identity, Self>.copy(action: (Self) -> Unit): Self =
    copy().also(action)