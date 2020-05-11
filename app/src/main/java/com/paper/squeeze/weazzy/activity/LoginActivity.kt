package com.paper.squeeze.weazzy.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paper.squeeze.weazzy.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //login button
        loginButton.setOnClickListener {
            val intent:Intent = Intent(this,InitializeActivity::class.java)
            startActivity(intent)
        }
    }
}
