package com.bobandata.terminal.gather.mobileTerminalKt.ui.fragment

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.bobandata.terminal.gather.mobileTerminalKt.R
import com.bobandata.terminal.gather.mobileTerminalKt.adapter.LineAdapter
import com.bobandata.terminal.gather.mobileTerminalKt.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_linemanagement.*

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/16 17:18
 * @Description：
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class LineFragment : BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_linemanagement, null)
    }

    override fun initListener() {

        linemanagement_fragment_Search.setOnClickListener {

        }
        linemanagement_fragment_iv.setOnClickListener {

        }

        linemanagement_fragment_rv.layoutManager = LinearLayoutManager(context)

        val lineAdapter = LineAdapter()

        linemanagement_fragment_rv.adapter = lineAdapter

    }
}