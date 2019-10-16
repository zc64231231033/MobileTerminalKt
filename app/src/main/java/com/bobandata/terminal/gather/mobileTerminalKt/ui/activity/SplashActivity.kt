package com.bobandata.terminal.gather.mobileTerminalKt.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.bobandata.terminal.gather.mobileTerminalKt.R
import com.bobandata.terminal.gather.mobileTerminalKt.base.BaseAcitivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseAcitivity(), ViewPropertyAnimatorListener {
    override fun onAnimationEnd(p0: View?) {

        /**
         * 动画结束之后
         */
        startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(p0: View?) {

    }

    override fun onAnimationStart(p0: View?) {

    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        ViewCompat.animate(imgeView).scaleX(1.0f).scaleY(1.0f).setListener(this).setDuration(2000)
    }
}
