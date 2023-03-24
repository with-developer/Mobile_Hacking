package com.example.myapplication5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LinearLayout manager = (LinearLayout)findViewByid(R.id.Layout_manager)
        manager.setOrientation(LinearLayout.HORIZONTAL)

        Button button = (button)findViewByid(R.id.button01)
        button.setText("첫번째 버튼")
    }
}