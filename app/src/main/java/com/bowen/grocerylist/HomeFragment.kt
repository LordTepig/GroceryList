package com.bowen.grocerylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.bowen.grocerylist.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val rootView = binding.root
        // Inflate the layout for this fragment
        binding.startListButton.setOnClickListener {
            //navigate to groceryListFragment
        }
        return rootView
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}