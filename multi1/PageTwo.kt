package com.example.multi1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.multi1.databinding.ActivityPageTwoBinding

class PageTwo : AppCompatActivity() {
    private lateinit var binding: ActivityPageTwoBinding

    lateinit var binding: ActivityPageTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPageTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dataOne = intent.getStringExtra("numberPageOne")
        binding.txtDataOutPageOne.text = dataOne
    }
    fun btnClickForOne(view: View){
        val intent = Intent(this,MainActivity::class.java)
        intent.putExtra("twoName",binding.txtTwoName.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}