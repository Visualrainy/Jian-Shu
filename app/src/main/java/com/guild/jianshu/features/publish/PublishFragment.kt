package com.guild.jianshu.features.publish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guild.jianshu.R
import com.guild.jianshu.features.BaseFragment

/**
 * Created by pchen on 20/03/2018.
 */
class PublishFragment : BaseFragment() {
    companion object {
        fun newInstance(): PublishFragment = PublishFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.publish_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}