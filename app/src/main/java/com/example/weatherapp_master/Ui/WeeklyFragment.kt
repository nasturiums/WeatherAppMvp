package com.example.weatherapp_master.Ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weatherapp_master.R
import com.example.weatherapp_master.databinding.FragmentWeeklyBinding


/**
 * A simple [Fragment] subclass.
 * Use the [WeeklyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WeeklyFragment : Fragment() {
    val binding : FragmentWeeklyBinding by lazy{FragmentWeeklyBinding.inflate(layoutInflater)}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }


}