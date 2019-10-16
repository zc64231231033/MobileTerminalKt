package com.bobandata.terminal.gather.mobileTerminalKt.ui.fragment

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.bobandata.terminal.gather.mobileTerminalKt.R
import com.bobandata.terminal.gather.mobileTerminalKt.adapter.HistroyAdapter
import com.bobandata.terminal.gather.mobileTerminalKt.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_history.*

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/16 17:17
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class HistroyFragment : BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context,R.layout.fragment_history,null)
    }

    override fun initListener() {

        //初始化
        rv_history.layoutManager = LinearLayoutManager(context)
        //适配
        val adapter = HistroyAdapter()
        rv_history.adapter = adapter

    }
}