package com.bobandata.terminal.gather.mobileTerminalKt.ui.fragment

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.bobandata.terminal.gather.mobileTerminalKt.R
import com.bobandata.terminal.gather.mobileTerminalKt.adapter.EquipmentAdapter
import com.bobandata.terminal.gather.mobileTerminalKt.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_equipment.*

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/16 17:18
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class EquipmentFragment : BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_equipment,null)
    }

    override fun initListener() {

        equipment_fragment_left_iv.setOnClickListener {

        }
        equipment_fragment_left_tv.setOnClickListener {

        }
        equipment_fragment_right_tv.setOnClickListener {

        }
        equipment_fragment_right_iv.setOnClickListener {

        }
        equipment_fragment_rv.layoutManager = LinearLayoutManager(context)
        val equipmentAdapter = EquipmentAdapter()
        equipment_fragment_rv.adapter = equipmentAdapter

    }
}