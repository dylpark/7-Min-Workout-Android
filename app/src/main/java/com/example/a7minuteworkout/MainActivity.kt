package com.example.a7minuteworkout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a7minuteworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Kotlin Synthetic (Deprecated) - Migrate to View Binding
    private lateinit var binding: ActivityMainBinding

    //Fragments
    //https://www.youtube.com/watch?v=MXZz438aCDM
    //private var _binding: FragmentHomeBinding? = null
    //private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.llStart.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Time to start the exercise.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}


/* import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llStart.setOnClickListener {
            Toast.makeText(
                    this@MainActivity,
                    "Time to start the exercise.",
                    Toast.LENGTH_SHORT
            ).show()
        }
    }
} */