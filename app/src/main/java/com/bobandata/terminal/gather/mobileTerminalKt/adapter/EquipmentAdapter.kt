package com.bobandata.terminal.gather.mobileTerminalKt.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.bobandata.terminal.gather.mobileTerminalKt.widght.EquipmentItemView

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/22 11:14
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class EquipmentAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        return EquipmentHolder(EquipmentItemView(p0.context))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {

    }

    class EquipmentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}