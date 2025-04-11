package com.zoe.wan.android.activity.home

import android.graphics.BitmapFactory
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.blankj.utilcode.util.LogUtils
import com.zoe.wan.android.BR
import com.zoe.wan.android.R
import com.zoe.wan.android.databinding.ActivityTabBinding
import com.zoe.wan.android.fragment.home.FragHome
import com.zoe.wan.android.fragment.common.FragCommon
import com.zoe.wan.android.fragment.mine.FragMine
import com.zoe.wan.base.BaseActivity
import com.zoe.wan.base.adapter.Pager2Adapter
import com.zoe.wan.base.tab.NavigationBottomBar

class TabActivity : BaseActivity<ActivityTabBinding, TabViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.activity_tab
    }

    override fun getViewModelId(): Int {
        return BR.homeVm
    }

    override fun initViewData() {
        initPageModule()
        //设置底部导航栏 arayOf是kotlin的语法 生成一个图片数组 使用decodeResource方法返回一个Bitmap对象
        //resources在父类中已经初始化，子类可以直接使用
        val icons = arrayOf(
            BitmapFactory.decodeResource(resources, R.drawable.icon_home_selected),
            BitmapFactory.decodeResource(resources, R.drawable.icon_hot_key_selected),
            BitmapFactory.decodeResource(resources, R.drawable.icon_personal_selected)
        )
        val icons2 = arrayOf(
            BitmapFactory.decodeResource(resources, R.drawable.icon_home_grey),
            BitmapFactory.decodeResource(resources, R.drawable.icon_hot_key_grey),
            BitmapFactory.decodeResource(resources, R.drawable.icon_personal_grey)
        )
        val tabTexts = arrayOf("Home", "Hot", "Personal")
        //Kotlin链式调用
        binding?.tabBottomBar?.let {
            it.setSelectedIcons(icons.toList())
                .setUnselectIcons(icons2.toList())
                .setTabText(tabTexts.toList())
                .setupViewpager(binding?.tabViewPager2)//将ViewPager2与底部导航栏绑定
                .start()
        }
        binding?.tabBottomBar?.registerTabClickListener(object :
            NavigationBottomBar.OnBottomTabClickListener {
            override fun tabClick(position: Int) {
                LogUtils.d("registerTabClickListener position=$position")
            }
        })
    }

    private fun initPageModule() {
        val pageFragList = mutableListOf<Fragment>()
        pageFragList.add(FragHome())
        pageFragList.add(FragCommon())
        pageFragList.add(FragMine())
        val pageAdapter = Pager2Adapter(this)
        pageAdapter.setData(pageFragList)
        //offscreenPageLimit默认不做预加载Fragment，会初始化所有fragment，造成性能损耗
        binding?.tabViewPager2?.offscreenPageLimit = ViewPager2.OFFSCREEN_PAGE_LIMIT_DEFAULT
        binding?.tabViewPager2?.adapter = pageAdapter
    }

}
