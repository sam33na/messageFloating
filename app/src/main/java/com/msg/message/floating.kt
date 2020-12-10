package com.msg.message

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast

class floating : AppCompatActivity() {
    private lateinit var floatingBtn: RelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating)

       floatingBtn=findViewById(R.id.floatingBtn)
        floatingBtn.setOnClickListener()
        {
            Toast.makeText(this@floating, "I'm Clikec",
                    Toast.LENGTH_SHORT).show()

        }
    }
}