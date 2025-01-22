package com.example.bottomnavigation.ui.weather

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.FragmentPersonInfoBinding
import com.example.bottomnavigation.databinding.FragmentWeatherBinding
import com.example.bottomnavigation.ui.person.PersonInfoViewModel

class WeatherFragment : Fragment() {

    private var _binding: FragmentWeatherBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): LinearLayout? {

        val weatherViewModel = ViewModelProvider(this)[WeatherViewModel::class.java]
        _binding = FragmentWeatherBinding.inflate(inflater, container, false)
        val textView = binding?.weatherTextView
        //  val recyclerView = binding?.notesRecyclerView
        weatherViewModel.text.observe(/* owner = */ viewLifecycleOwner){
            textView?.text = it
        }
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}