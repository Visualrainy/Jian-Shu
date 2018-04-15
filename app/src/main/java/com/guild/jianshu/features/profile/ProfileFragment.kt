package com.guild.jianshu.features.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guild.jianshu.R
import com.guild.jianshu.features.BaseFragment
import com.guild.jianshu.features.profile.helper.ProfileHelper
import com.guild.jianshu.features.profile.view.ProfileContainerView

/**
 * Created by pchen on 20/03/2018.
 */
class ProfileFragment : BaseFragment() {
    companion object {
        fun newInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.profile_fragment, container, false)
        populateProfileContainerView(view, inflater)
        return view
    }

    private fun populateProfileContainerView(view: View?, inflater: LayoutInflater?) {
        val profileArticleContainerView = view?.findViewById<ProfileContainerView>(R.id.profile_article_container)
        val profileArticleContainerItems = ProfileHelper.getProfileContainerItems(resources,
                R.array.profile_articles, R.array.profile_article_icons)
        profileArticleContainerView?.setAdapter(ProfileContainerAdapter(profileArticleContainerItems))

        val profileMineContainerView = view?.findViewById<ProfileContainerView>(R.id.profile_mine_container)
        val profileMineContainerItems = ProfileHelper.getProfileContainerItems(resources,
                R.array.profile_mine, R.array.profile_mine_icons)
        profileMineContainerView?.setAdapter(ProfileContainerAdapter(profileMineContainerItems))

        val profileSettingContainerView = view?.findViewById<ProfileContainerView>(R.id.profile_setting_container)
        val profileSettingItems = ProfileHelper.getProfileContainerItems(resources,
                R.array.profile_settings, R.array.profile_settings_icons)
        profileSettingContainerView?.setAdapter(ProfileContainerAdapter(profileSettingItems))

        val profileFeedbackContainerView = view?.findViewById<ProfileContainerView>(R.id.profile_feedback_container)
        val profileFeedbackItems = ProfileHelper.getProfileContainerItems(resources,
                R.array.profile_feedback, R.array.profile_feedback_icons)
        profileFeedbackContainerView?.setAdapter(ProfileContainerAdapter(profileFeedbackItems))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}