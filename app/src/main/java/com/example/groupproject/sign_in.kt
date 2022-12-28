package com.example.groupproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.groupproject.databinding.ActivityRegisterBinding
import com.example.groupproject.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth

class sign_in : AppCompatActivity() {

//    private lateinit var binding: ActivitySignInBinding
//    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }
}