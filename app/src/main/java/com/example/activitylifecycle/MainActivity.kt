package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
        const val TAG = "Main Activity"
        const val ONE = "First number"
        const val TWO = "Second number"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate called")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        if(savedInstanceState != null){
            binding.firstNumber.text = savedInstanceState.getCharSequence(ONE)
            binding.secondNumber.text = savedInstanceState.getCharSequence(TWO)
        }
        binding.addBtn.setOnClickListener {
             val ranRange = (1..20)
            binding.firstNumber.text = ranRange.random().toString()
            binding.secondNumber.text = ranRange.random().toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putCharSequence(ONE, binding.firstNumber.text)
        outState.putCharSequence(TWO, binding.secondNumber.text)
    }
    override fun onStart() {
        Log.d(TAG, "onStart called")
        super.onStart()
    }
    override fun onResume() {
        Log.d(TAG, "onResume called")
        super.onResume()
    }
    override fun onPause() {
        Log.d(TAG, "onPause called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy called")
        super.onDestroy()
    }
}