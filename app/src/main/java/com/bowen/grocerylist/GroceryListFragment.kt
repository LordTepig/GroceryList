package com.bowen.grocerylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bowen.grocerylist.databinding.FragmentGroceryListBinding

class GroceryListFragment : Fragment() {

    private var _binding: FragmentGroceryListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGroceryListBinding.inflate(inflater, container, false)
        val rootView = binding.root
        // Inflate the layout for this fragment
        return rootView
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}