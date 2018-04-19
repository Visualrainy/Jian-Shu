package com.guild.jianshu.features.message

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guild.jianshu.R
import com.guild.jianshu.features.BaseFragment

/**
 * Created by pchen on 20/03/2018.
 */
class MessageFragment : BaseFragment() {
    companion object {
        fun newInstance(): MessageFragment = MessageFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.message_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}