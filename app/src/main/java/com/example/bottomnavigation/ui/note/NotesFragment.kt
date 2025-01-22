package com.example.bottomnavigation.ui.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import com.example.bottomnavigation.databinding.FragmentNotesBinding

class NotesFragment : Fragment() {

    private var _binding: FragmentNotesBinding? = null
    private val binding get() = _binding

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): LinearLayout? {

val noteViewModel = ViewModelProvider(this)[NotesViewModel::class.java]
_binding = FragmentNotesBinding.inflate(inflater, container, false)
            val textView = binding?.noteEditText
          //  val recyclerView = binding?.notesRecyclerView
noteViewModel.text.observe(/* owner = */ viewLifecycleOwner){
    textView?.text = it
}
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}