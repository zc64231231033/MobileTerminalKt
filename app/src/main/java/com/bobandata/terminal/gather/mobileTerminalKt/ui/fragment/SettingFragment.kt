package com.bobandata.terminal.gather.mobileTerminalKt.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment
import android.preference.PreferenceScreen
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bobandata.terminal.gather.mobileTerminalKt.R
import com.bobandata.terminal.gather.mobileTerminalKt.base.BaseFragment
import com.bobandata.terminal.gather.mobileTerminalKt.ui.activity.AboutActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/15 14:48
 * @Description： // 设置页面
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class SettingFragment: PreferenceFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        addPreferencesFromResource(R.xml.setting)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onPreferenceTreeClick(preferenceScreen: PreferenceScreen?, preference: Preference?): Boolean {
        val key = preference?.key
        if (key.equals("about")) {
            //点击了关于
            activity.startActivity(Intent(activity,AboutActivity::class.java))
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference)
    }
}