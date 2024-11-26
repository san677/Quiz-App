package com.example.qquiz.ActivitiesLOg

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.qquiz.databinding.ActivitySingupBinding
import com.google.firebase.auth.FirebaseAuth


class SingupActivity : AppCompatActivity() {

    lateinit var binding: ActivitySingupBinding
    lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySingupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.SignUpButton.setOnClickListener {
            signUpUser()
        }
        binding.LoginBtnINSignup.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    private fun signUpUser() {

        val email = binding.edEmailAddresssign.text.toString()
        val password = binding.etPassword.text.toString()
        val confirmpassword = binding.emConfirnPassword.text.toString()

        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    //code
                    Toast.makeText(this, "SIGNIN Successful", Toast.LENGTH_LONG).show()


                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "ERROR IN CREATING USER", Toast.LENGTH_LONG).show()
                }
            }
    }
}