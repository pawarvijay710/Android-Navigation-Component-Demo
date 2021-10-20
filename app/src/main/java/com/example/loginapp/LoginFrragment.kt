package com.example.loginapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayoutStates
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFrragment : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view?.findViewById<TextView>(R.id.txt_forgot_password).setOnClickListener(this)
        view?.findViewById<ConstraintLayout>(R.id.layout_continue_login).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.txt_forgot_password -> {
                findNavController().navigate(R.id.action_login_to_forgot)
            }

            R.id.layout_continue_login->{
                findNavController().navigate(R.id.action_login_to_dashboard)
            }
        }
    }
}
