package com.nandaadisaputra.bottomnavigation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nandaadisaputra.bottomnavigation.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
    companion object {
        fun newInstance(): ProfileFragment  {
            val fragment = ProfileFragment ()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}