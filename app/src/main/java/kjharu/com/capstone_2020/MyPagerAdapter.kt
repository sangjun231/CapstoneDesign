package kjharu.com.capstone_2020

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) { //switch()문과 동일하다.
            0 -> {StockFragment()}
            1 -> {EmpFragment()}
            else -> {return SalesFragment()}
        }
    }

    override fun getCount(): Int {
        return 3 //3개니깐
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "재고관리"
            1 -> "직원관리"
            else -> {return "판매"}
        }
    }

}