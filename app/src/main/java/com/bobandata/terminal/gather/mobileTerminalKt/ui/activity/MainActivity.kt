package com.bobandata.terminal.gather.mobileTerminalKt.ui.activity

import android.support.v7.widget.Toolbar
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.ashokvarma.bottomnavigation.BottomNavigationBar.BACKGROUND_STYLE_RIPPLE
import com.ashokvarma.bottomnavigation.BottomNavigationBar.MODE_FIXED
import com.ashokvarma.bottomnavigation.BottomNavigationItem
import com.bobandata.terminal.gather.mobileTerminalKt.R
import com.bobandata.terminal.gather.mobileTerminalKt.base.BaseAcitivity
import com.bobandata.terminal.gather.mobileTerminalKt.util.FragmentUtil
import com.bobandata.terminal.gather.mobileTerminalKt.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find

class MainActivity : BaseAcitivity(), ToolBarManager {

    private var mIndex: Int = 0
    //惰性加载 并且是线程安全的
    override val toolbar by lazy { find<Toolbar>(R.id.toolBar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()
    }

    override fun initListener() {
        bottom_navigation_bar
            .setMode(MODE_FIXED) // 设置mode
            .setBackgroundStyle(BACKGROUND_STYLE_RIPPLE)  // 背景样式
            .setBarBackgroundColor("#2FA8E1") // 背景颜色
            .setInActiveColor("#929292") // 未选中状态颜色
            .setActiveColor("#ffffff") // 选中状态颜色
            .addItem(
                BottomNavigationItem(
                    R.drawable.icon_buttom_state_now,
                    "首页"
                ).setInactiveIconResource(R.drawable.icon_buttom_state)
            ) // 添加Item
            .addItem(
                BottomNavigationItem(
                    R.drawable.icon_buttom_historical_now,
                    "历史数据"
                ).setInactiveIconResource(R.drawable.icon_buttom_historical)
            )
            .addItem(
                BottomNavigationItem(
                    R.drawable.icon_buttom_system_now,
                    "系统设置"
                ).setInactiveIconResource(R.drawable.icon_buttom_system)
            )
            .addItem(
                BottomNavigationItem(
                    R.drawable.icon_buttom_information_now,
                    "设备信息"
                ).setInactiveIconResource(R.drawable.icon_buttom_information)
            )
            .addItem(
                BottomNavigationItem(
                    R.drawable.icon_buttom_line_now,
                    "线路管理"
                ).setInactiveIconResource(R.drawable.icon_buttom_line)
            )
            .setFirstSelectedPosition(0) //设置默认选中位置
            .initialise()  // 提交初始化（完成配置）
        seletFragment(0)

        /**
         * 设置BottomNavigationBar 的切换监听
         *
         */
        bottom_navigation_bar
            .setTabSelectedListener(object : BottomNavigationBar.OnTabSelectedListener {
                override fun onTabReselected(position: Int) {
                    //重复选择的item
                    println("重复选择的item$position ")
                }

                override fun onTabUnselected(position: Int) {
                    //上一次选中的item
                    println("上一次选中的item$position ")
                }

                override fun onTabSelected(position: Int) {
                    //当前选中的item
                    println("当前选中的item$position ")
                    seletFragment(position)
                }
            })
    }

    private fun seletFragment(position: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        FragmentUtil.fragmentUtil.getFragment(position)?.let {
            transaction.replace(
                R.id.container,
                it, position.toString()
            )
        }
        transaction.commit()
    }
}