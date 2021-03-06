package vn.com.nghiemduong.tradix.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vn.com.nghiemduong.tradix.R
import vn.com.nghiemduong.tradix.databinding.ActivityPasswordChangedBinding

class PasswordChangedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPasswordChangedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPasswordChangedBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.tvLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this, LoginActivity::class.java))
    }
}