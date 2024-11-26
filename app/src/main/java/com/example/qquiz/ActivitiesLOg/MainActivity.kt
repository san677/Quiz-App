package com.example.qquiz.ActivitiesLOg

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.qquiz.Adapters.QuizAdapter
import com.example.qquiz.Models.Quiz
import com.example.qquiz.R
import com.example.qquiz.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    lateinit var adapter: QuizAdapter
    private var quizList = mutableListOf<Quiz>()
    lateinit var firestore: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpviews()

        populateDummydata()
        setUpREcyclerView()





     }

    private fun populateDummydata() {

        quizList.add(Quiz("12/10/2024", "12/10/2024"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))
        quizList.add(Quiz("12/10/2024", "hiiii"))


    }

    private fun setUpREcyclerView() {

        adapter = QuizAdapter(this, quizList)
        binding.quizRecyclerview.layoutManager = GridLayoutManager(this, 2)
        binding.quizRecyclerview.adapter = adapter
    }

    private fun setUpviews() {
        setUpDrawerLayout()
    }

    private fun setUpDrawerLayout() {
        setSupportActionBar(binding.topAppBar)
        actionBarDrawerToggle = ActionBarDrawerToggle(
            this, binding.mainDrawer,
            R.string.app_name,
            R.string.app_name
        )
        actionBarDrawerToggle.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}