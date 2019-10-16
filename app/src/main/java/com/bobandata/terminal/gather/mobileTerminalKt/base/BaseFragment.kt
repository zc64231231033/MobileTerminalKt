package com.bobandata.terminal.gather.mobileTerminalKt.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/13 10:36
 * @Description： //fragment的基类
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */
abstract class BaseFragment : Fragment(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    /**
     * fargment初始化
     */
    open protected fun init() {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return initView()
    }

    /**
     * 获取布局view
     */
    abstract fun initView(): View?

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    /**
     * 初始化数据
     */
    protected open fun initData() {


    }

    /**
     * 初始化adapter listener
     */
    protected open fun initListener() {


    }

    fun myToast(mag:String){
        context?.runOnUiThread { toast(mag) }
    }
}