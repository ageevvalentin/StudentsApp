package com.example.studentsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import architecture.mvp.presenter.ScreenObserver

abstract class ScreenActivity<Screen : Any> : AppCompatActivity() {
    class RetainFragment : Fragment() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            retainInstance = true
        }
    }

    companion object {
        private const val TAG_RETAIN_FRAGMENT = "retainFragment"
    }

    abstract val screenObserver: ScreenObserver<Screen>

    abstract val screen: Screen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (supportFragmentManager.findFragmentByTag(TAG_RETAIN_FRAGMENT) == null) {
            supportFragmentManager.commit {
                add(RetainFragment(), TAG_RETAIN_FRAGMENT)
            }
        }

        screenObserver.subscribe(screen)
    }

    override fun onDestroy() {
        super.onDestroy()

        screenObserver.unsubscribe()

        if (supportFragmentManager.findFragmentByTag(TAG_RETAIN_FRAGMENT) == null) {
            screenObserver.dispose()
        }
    }
}