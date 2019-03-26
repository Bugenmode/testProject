package com.bugenmode.abakycharov.testproject.ui.base

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpView

abstract class BaseFragment : Fragment(), MvpView {
    abstract val layoutRes : Int

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(layoutRes, container, false)
    }
}