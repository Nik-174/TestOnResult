package com.example.testonresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onClick(view: View){
        val q = Intent()
        q.putExtra("key1","done")
        setResult(RESULT_OK,q)
        finish()
    }
}