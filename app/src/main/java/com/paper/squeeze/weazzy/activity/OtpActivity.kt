package com.paper.squeeze.weazzy.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paper.squeeze.weazzy.R
import kotlinx.android.synthetic.main.activity_otp.*

class OtpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        //to verify and open activity accordingly
        verifyButton.setOnClickListener {
            if (intent.getIntExtra("login",0)==1)
                startActivity(Intent(this,LoginActivity::class.java))
            else
                //for registration
                startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}
