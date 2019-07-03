package architecture.mvp.presenter

interface ScreenObserver<Screen : Any> {
    fun subscribe(screen: Screen)
    fun unsubscribe()

    fun dispose()
}