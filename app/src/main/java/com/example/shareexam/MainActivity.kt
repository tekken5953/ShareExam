package com.example.shareexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shareBtn: Button = findViewById(R.id.shareBtn)

        shareBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND_MULTIPLE)
            intent.type = "text/plain"

            val blogUrl = "https://tekken5953.tistory.com/"
            val content = "친구가 링크를 공유했어요!\n어떤 링크인지 들어가서 확인해볼까요?"
            intent.putExtra(Intent.EXTRA_TEXT,"$content\n\n$blogUrl")

            val chooserTitle = "친구에게 공유하기"
            startActivity(Intent.createChooser(intent, chooserTitle))
        }
    }
}

