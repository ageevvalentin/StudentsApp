package com.example.studentsapp.students

import android.util.Log
import architecture.mvp.presenter.Presenter

class StudentsPresenter: Presenter<StudentsScreen>() {
    init {
        Log.i("StudentsPresenter", "dependencies")
    }

    override fun onSubscribe(screen: StudentsScreen) {
        super.onSubscribe(screen)

        Log.i("StudentsPresenter", "onSubscribe")
    }

    override fun onUnsubscribe() {
        super.onUnsubscribe()

        Log.i("StudentsPresenter", "onUnsubscribe")
    }

    override fun onDispose() {
        super.onDispose()

        Log.i("StudentsPresenter", "onDispose")
    }
}