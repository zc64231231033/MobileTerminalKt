package com.bobandata.terminal.gather.mobileTerminalKt.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.bobandata.terminal.gather.mobileTerminalKt.widght.LineItemView

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/22 14:19
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class LineAdapter: RecyclerView.Adapter<LineAdapter.LineHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): LineHolder {
        return LineHolder(LineItemView(p0.context))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(p0: LineHolder, p1: Int) {

    }

    class LineHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}