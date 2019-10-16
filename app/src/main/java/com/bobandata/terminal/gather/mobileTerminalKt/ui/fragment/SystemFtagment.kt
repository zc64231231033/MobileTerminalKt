package com.bobandata.terminal.gather.mobileTerminalKt.ui.fragment

import android.view.View
import com.bobandata.terminal.gather.mobileTerminalKt.R
import com.bobandata.terminal.gather.mobileTerminalKt.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_system.*

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/16 17:17
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class SystemFtagment : BaseFragment() {

    private var userName: String = ""
    private var passWord: String = ""

    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_system, null)
    }

    override fun initListener() {

        system_fragment_ed1.setOnClickListener {

        }
        system_fragment_ed2.setOnClickListener {

        }

        enter_btn.setOnClickListener {
            //登陆
            userName = system_fragment_ed1.text.toString().toLowerCase()
            passWord = system_fragment_ed2.text.toString().toLowerCase()

            if (!userName.isEmpty() && !passWord.isEmpty()) {
                login(userName, passWord)
            } else {
                myToast("账号或者密码不能为空")
            }
        }

    }

    private fun login(userName: String, passWord: String) {
        myToast("登陆成功-账号$userName " +
                "密码$passWord")
    }
}