package com.example.a7minuteworkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a7minuteworkout.databinding.ActivityExerciseBinding

class ExerciseActivity() : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarExerciseActivity)
        val actionbar = supportActionBar
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true)
        }

        binding.toolbarExerciseActivity.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}

//Kotlin Synthetic (Deprecated) - Migrate to View Binding
//Fragments
//https://www.youtube.com/watch?v=MXZz438aCDM
//private var _binding: FragmentHomeBinding? = null
//private val binding get() = _binding!!
