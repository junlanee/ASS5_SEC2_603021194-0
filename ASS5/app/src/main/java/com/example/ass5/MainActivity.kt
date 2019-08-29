package com.example.ass5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v: View){
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        val selectedId:Int = radioGroup.checkedRadioButtonId
        val radioButton: RadioButton = findViewById(selectedId)
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("empData",Employee(nameEDT.text.toString(),radioButton.text.toString(),emailEDT.text.toString()
            ,salaryEDT.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(v: View){
        nameEDT.text.clear()
        radioGroup.clearCheck()
        emailEDT.text.clear()
        salaryEDT.text.clear()
    }
}
