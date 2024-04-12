package com.example.navigationcomponentexample.ui.theme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentexample.R


class First : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.fragment_first, container, false)

        val btnNavigate = root.findViewById<Button>(R.id.btnNavigate)

        btnNavigate.setOnClickListener {
            findNavController().navigate(R.id.action_first_to_secondFragment)
        }

        return root
    }

}