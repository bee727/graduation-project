package com.ricardotejo.openpose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.ricardotejo.openpose.databinding.HomefragmentBinding
import com.ricardotejo.openpose.databinding.LikefragmentBinding

class LikeFragment : Fragment() {

    private lateinit var binding: LikefragmentBinding



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LikefragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onResume() {
        super.onResume()
        val activity = activity
        if (activity != null) {
            (activity as MainActivity).setActionBarTitle("Like List")
        }
    }


}