package com.paper.squeeze.weazzy.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.paper.squeeze.weazzy.R
import com.paper.squeeze.weazzy.adapter.ChatsAdapter
import kotlinx.android.synthetic.main.fragment_chat.*
import kotlinx.android.synthetic.main.fragment_chat.recyclerView
import kotlinx.android.synthetic.main.fragment_chat.view.*
import java.util.*


class ChatFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    var root:View? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (root == null) {
            // Inflate the layout for this fragment
            root = inflater.inflate(R.layout.fragment_chat, container, false)

            //setting up the collapsing toolbar
            (activity as AppCompatActivity?)!!.setSupportActionBar(toolbar)
            (activity as AppCompatActivity?)!!.supportActionBar?.setDisplayHomeAsUpEnabled(false)
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //recyclerView setup
        recyclerView.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = ChatsAdapter()
        }

        //to hide focus
        searchEditText.clearFocus()

        //to gain focus
        searchEditText.setOnClickListener {
            appBarLayout.setExpanded(true)
            searchEditText.isFocusable = true
            searchEditText.isFocusableInTouchMode = true
        }

        //to search and also scroll appbar to expanded state
        searchEditText.addTextChangedListener( object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                appBarLayout.setExpanded(true)
            }
        })

    }

    //to create a singleton class
    companion object {
        fun newInstance() = ChatFragment()
    }

}
