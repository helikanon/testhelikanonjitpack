package com.helikanonlibsample.testjitpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.helikanonlibsample.helikanontestlib.HelikanonTestLibTutorial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        HelikanonTestLibTutorial.test1("Denemee")
    }
}