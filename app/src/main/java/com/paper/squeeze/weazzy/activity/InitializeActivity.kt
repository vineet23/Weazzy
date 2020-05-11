package com.paper.squeeze.weazzy.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.paper.squeeze.weazzy.R

class InitializeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initialize)

        //for demo to open home activity
        Handler().postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        },3000)

    }
}
