package com.bobandata.terminal.gather.mobileTerminalKt.ui.activity

import android.preference.PreferenceManager
import android.support.v7.widget.Toolbar
import com.bobandata.terminal.gather.mobileTerminalKt.R
import com.bobandata.terminal.gather.mobileTerminalKt.base.BaseAcitivity
import com.bobandata.terminal.gather.mobileTerminalKt.util.ToolBarManager
import org.jetbrains.anko.find

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/15 14:33
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class SettingActivity: BaseAcitivity(),ToolBarManager {
    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.toolBar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolbar()
        //获取通知选中状态
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val boolean = sharedPreferences.getBoolean("push", false)
        println("push = $boolean")
    }
}