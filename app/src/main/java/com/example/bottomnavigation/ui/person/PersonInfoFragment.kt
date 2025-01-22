package com.example.bottomnavigation.ui.person

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.FragmentNotesBinding
import com.example.bottomnavigation.databinding.FragmentPersonInfoBinding
import com.example.bottomnavigation.ui.note.NotesViewModel

class PersonInfoFragment : Fragment() {

    private var _binding: FragmentPersonInfoBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): LinearLayout? {

        val personViewModel = ViewModelProvider(this)[PersonInfoViewModel::class.java]
        _binding = FragmentPersonInfoBinding.inflate(inflater, container, false)
        val textView = binding?.nameEditText
        //  val recyclerView = binding?.notesRecyclerView
        personViewModel.text.observe(/* owner = */ viewLifecycleOwner){
            textView?.text = it
        }
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}