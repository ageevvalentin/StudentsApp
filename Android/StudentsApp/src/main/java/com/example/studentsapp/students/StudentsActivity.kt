package com.example.studentsapp.students

import android.os.Bundle
import architecture.mvp.presenter.ScreenObserver
import com.example.studentsapp.BaseActivity
import com.example.studentsapp.R
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

class StudentsActivity : BaseActivity<StudentsScreen>(), StudentsScreen {
    override val dependencies: Kodein.MainBuilder.() -> Unit = {
        bind<ScreenObserver<StudentsScreen>>() with singleton { StudentsPresenter() }
    }

    override val screenObserver by instance<ScreenObserver<StudentsScreen>>()
    override val screen: StudentsScreen = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}