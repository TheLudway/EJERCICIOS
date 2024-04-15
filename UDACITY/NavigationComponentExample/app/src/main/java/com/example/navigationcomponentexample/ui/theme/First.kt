package com.example.navigationcomponentexample.ui.theme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import android.util.Log
import com.example.navigationcomponentexample.R
import com.example.navigationcomponentexample.databinding.ActivityMainBinding
import com.example.navigationcomponentexample.databinding.FragmentFirstBinding


class First : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)

        initUI()


        val btnNavigate = binding.btnNavigate

        btnNavigate.setOnClickListener {
            findNavController().navigate(FirstDirections.actionFirstToSecondFragment(
                ))
        }

        return binding.root
    }

    private fun initUI() {
        binding.btnNavigate.setOnClickListener {

        }

        binding.editTextUser.setOnClickListener {

        }

        binding.editTextPassword.setOnClickListener {

        }
    }

}