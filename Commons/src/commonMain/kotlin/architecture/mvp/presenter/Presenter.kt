package architecture.mvp.presenter

abstract class Presenter<Screen : Any> : ScreenObserver<Screen> {
    var screen: Screen? = null

    var disposed = false

    final override fun subscribe(screen: Screen) {
        if (this.screen != null) {
            throw IllegalStateException("Presenter is already subscribed.")
        }

        onSubscribe(screen)

        this.screen = screen
    }

    final override fun unsubscribe() {
        if (screen == null) {
            throw IllegalStateException("Presenter is not subscribed.")
        }

        onUnsubscribe()

        screen = null
    }

    protected open fun onSubscribe(screen: Screen) {
    }

    protected open fun onUnsubscribe() {
    }

    final override fun dispose() {
        if (disposed) {
            throw IllegalStateException("Presenter is already disposed of.")
        }

        onDispose()

        disposed = true
    }

    protected open fun onDispose() {
    }
}