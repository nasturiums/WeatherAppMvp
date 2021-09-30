package com.example.weatherapp_master.Ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weatherapp_master.databinding.FragmentDayliBinding
import com.example.weatherapp_master.databinding.FragmentDrawerBinding

class DrawerFragment :Fragment() {
    private val binding: FragmentDrawerBinding by lazy { FragmentDrawerBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }
}