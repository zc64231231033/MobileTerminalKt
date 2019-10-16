package com.bobandata.terminal.gather.mobileTerminalKt.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.bobandata.terminal.gather.mobileTerminalKt.widght.HomeItemView

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/16 10:01
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): HomeHolder {
        return HomeHolder(HomeItemView(p0.context))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(p0: HomeHolder, p1: Int) {

    }

    class HomeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}