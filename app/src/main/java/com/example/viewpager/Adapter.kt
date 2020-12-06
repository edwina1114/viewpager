package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Adapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager)  {
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return rice_f()
            1 -> return noodles_f()
            2 -> return soup_f()
            3 -> return meat_f()
            4 -> return vegetable_f()
            5 -> return fruit_f()
            6 -> return dessert_f()
            7 -> return breakfast_f()
            else -> return qaz_f()
        }
    }

    override fun getCount(): Int {
        return 8
    }

    override fun getPageTitle(position: Int): CharSequence {
        when(position){
            0 -> return "Rice"
            1 -> return "Noodles"
            2 -> return "Soup"
            3 -> return "Meat"
            4 -> return "Vegetable"
            5 -> return "Fruit"
            6 -> return "Dessert"
            7 -> return "Breakfast"
            else -> return "qaz"
        }
    }
}