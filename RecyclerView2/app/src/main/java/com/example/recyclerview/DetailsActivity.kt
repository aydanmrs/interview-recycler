package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent=intent

        val selectedItem=intent.getSerializableExtra("question") as Question
        binding.proqram.text=selectedItem.proqram
        binding.question1.text=selectedItem.sual1
        binding.question2.text=selectedItem.sual2
        binding.question3.text=selectedItem.sual3
        binding.img.setImageResource(selectedItem.image)


    }
}