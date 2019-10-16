package com.bobandata.terminal.gather.mobileTerminalKt.util

import com.bobandata.terminal.gather.mobileTerminalKt.base.BaseFragment
import com.bobandata.terminal.gather.mobileTerminalKt.ui.fragment.*

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/15 17:22
 * @Description： //TODO
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
class FragmentUtil private constructor(){ //私有化构造方法

    val homeFargment by lazy { HomeFargment() }
    val homeCommunicationFragment by lazy { HomeCommunicationFragment() }
    val homeRunningFragment by lazy { HomeRunningFragment() }

    val histroyFragment by lazy { HistroyFragment() }
    val systemFtagment by lazy { SystemFtagment() }
    val equipmentFragment by lazy { EquipmentFragment() }
    val lineFragment by lazy { LineFragment() }
    //伴生对象
    companion object{
        val fragmentUtil by lazy { FragmentUtil() }
    }

    /**
     * 根据TabId 获取对应的fragment
     */
    fun getFragment(tabId:Int): BaseFragment? {
        when(tabId){
            0-> return homeFargment
            1-> return histroyFragment
            2-> return systemFtagment
            3-> return equipmentFragment
            4-> return lineFragment
        }
        return null
    }

    /**
     * 根据TabId 获取对应的fragment
     */
    fun getHomeFragment(tabId:Int): BaseFragment? {
        when(tabId){
            0-> return homeCommunicationFragment
            1-> return homeRunningFragment
        }
        return null
    }
}