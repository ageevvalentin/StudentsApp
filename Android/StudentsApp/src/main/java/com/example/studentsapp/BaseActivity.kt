package com.example.studentsapp

import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.android.retainedSubKodein

abstract class BaseActivity<Screen : Any> : ScreenActivity<Screen>(), KodeinAware {
    open val dependencies: Kodein.MainBuilder.() -> Unit = {}

    final override val kodein by retainedSubKodein(kodein()) { dependencies() }
}