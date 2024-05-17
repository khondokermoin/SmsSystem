package com.rumi.toolbardrawerlayoutdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.rumi.toolbardrawerlayoutdemo.databinding.FragmentCartBinding

class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val viewPager = binding.vpager
        val tabLayout = binding.tablayout1

        viewPager.adapter = MyPagerAdapter(childFragmentManager)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "SEND"
                1 -> "RECEIVE"
                else -> "Tab ${position + 1}"
            }
        }.attach()

        return binding.root
    }

}