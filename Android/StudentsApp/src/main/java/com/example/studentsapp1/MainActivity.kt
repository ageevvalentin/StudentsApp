package com.example.studentsapp1

import android.app.Activity
import android.os.Bundle
import sample.Sample

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        println(Sample().hello())
    }
}
