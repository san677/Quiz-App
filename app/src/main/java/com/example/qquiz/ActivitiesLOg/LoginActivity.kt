package com.example.qquiz.ActivitiesLOg

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.qquiz.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

     lateinit var binding: ActivityLoginBinding
     lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth=FirebaseAuth.getInstance()

        binding.Loginbutton.setOnClickListener {
            login()
        }

    binding.SignupbtnInLog.setOnClickListener {
        val intent= Intent(this, SingupActivity::class.java)
        startActivity(intent)
        finish()
    }
    }

    @SuppressLint("SuspiciousIndentation")
    private fun login() {
    val eamil:String=binding.edtEmailAddress.text.toString()
    val password=binding.etPassword.text.toString()

        firebaseAuth.createUserWithEmailAndPassword(eamil,password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this,"SUCCESS",Toast.LENGTH_LONG).show()

                    val intent= Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                else{
                    Toast.makeText(this,"Authonticaton is failes",Toast.LENGTH_LONG).show()
                }
            }
}}
