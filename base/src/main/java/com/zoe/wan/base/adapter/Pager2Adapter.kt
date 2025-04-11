package com.zoe.wan.base.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.viewpager2.adapter.FragmentStateAdapter

class Pager2Adapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val itemFragList = mutableListOf<Fragment>()

    override fun getItemCount() = itemFragList.size

    override fun createFragment(position: Int) = itemFragList[position]

    fun setData(newListData: List<Fragment>) {
        //使用DiffUtil更新ViewPager2数据
        val callback = PageDiffUtil(itemFragList, newListData)
        //计算新旧列表之间的最小变化集，后台线程执行，避免阻塞 UI 线程
        val difResult = DiffUtil.calculateDiff(callback)
        itemFragList.clear()
        itemFragList.addAll(newListData)
        difResult.dispatchUpdatesTo(this)
    }
}
