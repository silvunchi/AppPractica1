package com.curso.android.app.practica.apppracticauno

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class MainActivity : AppCompatActivity() {
        private var viewModel: ComparisonViewModel? = null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.getRoot())
            viewModel = ViewModelProvider(this).get(ComparisonViewModel::class.java)
            binding.setLifecycleOwner(this)
            binding.setViewModel(viewModel)
        }
    }
}