package com.guild.jianshu.features.profile

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guild.jianshu.R
import com.guild.jianshu.common.BaseFragment
import com.guild.jianshu.features.profile.helper.ProfileHelper
import com.guild.jianshu.features.profile.presenter.UserPresenter
import com.guild.jianshu.features.profile.view.ProfileContainerView
import com.guild.jianshu.features.profile.viewmodel.UserProfileViewModel
import kotlinx.android.synthetic.main.profile_fragment.*
import javax.inject.Inject

/**
 * Created by pchen on 20/03/2018.
 */
class ProfileFragment : BaseFragment() {
    private lateinit var userProfileViewModel: UserProfileViewModel

    @Inject
    lateinit var userPresenter: UserPresenter

    companion object {
        fun newInstance(): ProfileFragment = ProfileFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.profile_fragment, container, false)
        initProfileInfoView(view)
        initProfileContainerView(view)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        userProfileViewModel = ViewModelProviders.of(this).get(UserProfileViewModel::class.java)

    }

    private fun initProfileInfoView(view: View) {
        profile_info_layout.setOnClickListener {
                userProfileViewModel.user?.observe(this, Observer { user ->
                    Log.d("123123123","123123123123")
            })
        }
    }

    private fun initProfileContainerView(view: View?) {
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