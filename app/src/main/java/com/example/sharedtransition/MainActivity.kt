package com.example.sharedtransition

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sharedtransition.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        setup()
    }


    private fun setup() {
        binding.image.setOnClickListener {
            val options=ActivityOptionsCompat.makeSceneTransitionAnimation(this,binding.image,"image")
            startActivity(Intent(this,DetailedActivity::class.java),options.toBundle())
        }
    }
}