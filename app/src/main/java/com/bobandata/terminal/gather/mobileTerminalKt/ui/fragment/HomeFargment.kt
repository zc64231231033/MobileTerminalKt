package com.bobandata.terminal.gather.mobileTerminalKt.ui.fragment

import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.telecom.Call
import android.view.View
import com.bobandata.terminal.gather.mobileTerminalKt.R
import com.bobandata.terminal.gather.mobileTerminalKt.base.BaseFragment
import okhttp3.*
import org.jetbrains.anko.support.v4.find
import java.io.IOException


/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/15 17:16
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class HomeFargment : BaseFragment() {

    val tabLayout: TabLayout by lazy { find<TabLayout>(R.id.tablayout) }
    val viewPager: ViewPager by lazy { find<ViewPager>(R.id.viewpager) }

    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_home, null)
    }

    override fun initData() {
        loadData()

    }

    private fun loadData() {


    }

    override fun initListener() {


    }


}