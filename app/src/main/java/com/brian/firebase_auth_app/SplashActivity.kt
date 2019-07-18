package com.brian.firebase_auth_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long =3000  // 3 Sec

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            //this will start after time done
            startActivity(Intent(this,LoginActivity::class.java))

            // close this activity
            finish()
        },SPLASH_TIME_OUT)
    }
}
