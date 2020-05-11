package com.paper.squeeze.weazzy.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.paper.squeeze.weazzy.R
import kotlinx.android.synthetic.main.activity_phone_number.*


class PhoneNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_number)

        //to make the keyboard always appear
        phoneNumberEdit.setOnEditorActionListener { textView, actionId, keyEvent ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                //check if phone number is valid
                true
            }
            false
        }

        //next button
        next.setOnClickListener {
            val intent:Intent = Intent(this,OtpActivity::class.java)
            //to indicate that login is called
            intent.putExtra("login",1)
            startActivity(intent)
        }

        //for demo of register
        next.setOnLongClickListener {
            val intent:Intent = Intent(this,OtpActivity::class.java)
            //to indicate that register is called
            intent.putExtra("login",0)
            startActivity(intent)
            true
        }
    }

}
