package com.rumi.toolbardrawerlayoutdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle

class MyPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(
    fragmentManager
) {

    /*override fun getItemCount(): Int {
        return 2 // Change this according to the number of tabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SendFragment() // Create a SendFragment for the first tab
            1 -> ReceiveFragment() // Create a ReceiveFragment for the second tab
            else -> throw IllegalArgumentException("Invalid position")
        }
    }*/

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(p0: Int): Fragment {
        return when (p0) {
            0 -> SendFragment() // Create a SendFragment for the first tab
            1 -> ReceiveFragment() // Create a ReceiveFragment for the second tab
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}
