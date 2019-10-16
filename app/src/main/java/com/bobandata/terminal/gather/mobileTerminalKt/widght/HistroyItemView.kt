package com.bobandata.terminal.gather.mobileTerminalKt.widght

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.bobandata.terminal.gather.mobileTerminalKt.R

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/17 10:24
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class HistroyItemView: RelativeLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    /**
     * 初始化
     * //使用this添加到父布局，省略使用addview 这一步骤
     */
    init {
        View.inflate(context, R.layout.item_histroy,this)
    }
}