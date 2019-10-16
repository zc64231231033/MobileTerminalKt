package com.bobandata.terminal.gather.mobileTerminalKt.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.bobandata.terminal.gather.mobileTerminalKt.widght.HistroyItemView

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/17 10:30
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class HistroyAdapter: RecyclerView.Adapter<HistroyAdapter.HistroyHoldter>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): HistroyHoldter {
        return HistroyHoldter(HistroyItemView(p0.context))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(p0: HistroyHoldter, p1: Int) {

    }

    class HistroyHoldter(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}