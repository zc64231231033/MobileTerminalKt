package com.bobandata.terminal.gather.mobileTerminalKt.util

import android.content.Intent
import android.support.v7.widget.Toolbar
import com.bobandata.terminal.gather.mobileTerminalKt.R
import com.bobandata.terminal.gather.mobileTerminalKt.ui.activity.SettingActivity

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/14 18:05
 * @Description： //所有toolbar的管理类
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
interface ToolBarManager {

    val toolbar: Toolbar

    /**
     * main界面的toolbar
     */
    fun initMainToolBar() {

        toolbar.setTitle("系统状态")
        toolbar.inflateMenu(R.menu.main)
        //若java接口中只有一个未实现的方法 则可以省略接口对象 直接用{}表示为实现的方法
        toolbar.setOnMenuItemClickListener {
            //println("item=$it")
            //跳转设置界面
            toolbar.context.startActivity(Intent(toolbar.context, SettingActivity::class.java))
            true
        }
//        toolbar.setOnMenuItemClickListener(object :Toolbar.OnMenuItemClickListener {
//            override fun onMenuItemClick(p0: MenuItem?): Boolean {
//                when(p0?.itemId){
//                    R.id.setting->{
//                        //跳转设置界面
//                        toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
//                    }
//                }
//                return true
//            }
//        })
    }

    /**
     * setting界面的toolbar
     */
    fun initSettingToolbar(){
        toolbar.setTitle("设置界面")
    }
}