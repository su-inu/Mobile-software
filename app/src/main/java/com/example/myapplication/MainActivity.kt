package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnView: Button = findViewById(R.id.btnView)
        //val lis = BtnListener()
        btnView.setOnClickListener(BtnListener())        //괄호 안에 리스너 객체 등록시켜줘야함
    }

    inner class BtnListener : View.OnClickListener{     //inner : 클래스 바깥쪽에 있는 속성들 사용 가능
        override fun onClick(v: View?){
            //그냥 this 사용하면 안됨, BtnListener 는 UI를 구현하는 클래스가 아니어서
            //(엑티비티 컴포넌트를 구현하고 있는 객체, 문자열, 출력 시간 설정)
            Toast.makeText(applicationContext,"버튼이 눌렸습니다",Toast.LENGTH_SHORT).show()
        }
    }
}