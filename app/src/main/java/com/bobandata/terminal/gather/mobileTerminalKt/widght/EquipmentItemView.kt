package com.bobandata.terminal.gather.mobileTerminalKt.widght

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.bobandata.terminal.gather.mobileTerminalKt.R

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/22 11:17
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class EquipmentItemView: RelativeLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        View.inflate(context, R.layout.equipment_fragment_rv_item,this)
    }
}