package com.bobandata.terminal.gather.mobileTerminalKt.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bobandata.terminal.gather.mobileTerminalKt.ui.activity.MainActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

/**
 * @author     ：zhanglingzhi
 * @date       ：Created in 2019/5/13 10:25
 * @Description： //activity的基类
 * @modified By：
 * @Company: 上海博般数据技术有限公司
 * @version:     $version$
 */

abstract class BaseAcitivity : AppCompatActivity(),AnkoLogger{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()

    }

    /**
     * 获取布局ID
     */

    abstract fun getLayoutId(): Int

    /**
     * 初始化adpter listener
     */
    open protected fun initListener() {

    }

    /**
     * 初始化数据
     */
    open protected fun initData() {

    }

    protected fun myToast(mag:String){
        runOnUiThread { toast(mag) }
    }

    inline fun <reified T:BaseAcitivity>startActivityAndFinish() {
        startActivity<T>()
        finish()
    }
}