package com.guild.jianshu.features.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.guild.jianshu.R
import com.guild.jianshu.features.BaseFragment
import com.guild.jianshu.features.profile.view.ProfileItemView

/**
 * Created by pchen on 20/03/2018.
 */
class ProfileFragment : BaseFragment() {
    companion object {
        fun newInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.profile_fragment, container, false)
        populateProfileContainerView(view, inflater)
        return view
    }

    private fun populateProfileContainerView(view: View?, inflater: LayoutInflater?) {
        val profileContainerView = view?.findViewById<LinearLayout>(R.id.profile_article_container)
        val articleItemsTitle = resources.getStringArray(R.array.profile_articles)
        val articleItemsIcons = resources.obtainTypedArray(R.array.profile_article_icons)
        articleItemsTitle.forEachIndexed({ index: Int, str: String ->
            ProfileItemView(context).let {
                it.setItemName(str)
                it.setItemIcon(articleItemsIcons.getResourceId(index, -1))
                profileContainerView?.addView(it)
            }
        })
        articleItemsIcons.recycle()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}