package com.softwarepintarcom.rsiamuslimat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.softwarepintarcom.rsiamuslimat.login.LoginActivity
import com.softwarepintarcom.rsiamuslimat.registrasi.RegistrasiActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnlogin.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        })
        btnregistrasi.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,RegistrasiActivity::class.java))
        })
    }
}
