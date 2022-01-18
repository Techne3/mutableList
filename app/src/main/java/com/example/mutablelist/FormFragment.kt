package com.example.mutablelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mutablelist.databinding.FormBinding

class FormFragment : Fragment() {

    private var _binding: FormBinding? = null
    private val binding: FormBinding get() = _binding!!

    private lateinit var viewModel: ViewModelList


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FormBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ViewModelList::class.java]
        with(binding) {
            nextBtn.setOnClickListener {
                val firstNameStr = firstNameEt.editText.toString()
                val lastNameStr = lastNameEt.editText.toString()
                viewModel.addName(firstNameStr, lastNameStr)
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}