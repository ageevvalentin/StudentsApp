package com.example.studentsapp

import android.app.Application
import architecture.mvp.presenter.ScreenObserver
import com.example.studentsapp.students.StudentsPresenter
import com.example.studentsapp.students.StudentsScreen
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.ActivityRetainedScope
import org.kodein.di.android.androidCoreModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.scoped
import org.kodein.di.generic.singleton

class StudentsApplication : Application(), KodeinAware {
    override val kodein by Kodein.lazy {
    }
}