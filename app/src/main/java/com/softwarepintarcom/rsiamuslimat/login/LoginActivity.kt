package com.softwarepintarcom.rsiamuslimat.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import butterknife.ButterKnife
import com.softwarepintarcom.rsiamuslimat.HomeActivity
import com.softwarepintarcom.rsiamuslimat.R
import com.softwarepintarcom.rsiamuslimat.registrasi.RegistrasiActivity
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        ButterKnife.bind(this)
        btnlogin.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))

        })

    }
}
