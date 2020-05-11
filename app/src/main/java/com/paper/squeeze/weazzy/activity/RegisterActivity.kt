package com.paper.squeeze.weazzy.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paper.squeeze.weazzy.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        signUpButton.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
    }
}
