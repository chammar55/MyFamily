package com.example.myfamily

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    //LifeCycle Functions Must read about them

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMembers = listOf<MemberModel>(
            MemberModel("Ammar"),
            MemberModel("Umer"),
            MemberModel("Ans"),
            MemberModel("Hanan"),
            MemberModel("Manan"),
        )
        //Adapter put value in View(MemberAdapter file in myfamily folder)
       // Press CTRL + right click on MemberAdapter below to view view
        val adapter = MemberAdapter(listMembers)

        val recycler = requireView().findViewById<RecyclerView>( R.id.recycler_member   )
        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = adapter
    }
    //----------------------------------------------------------------------------
    companion object {
        @JvmStatic
        fun newInstance() =HomeFragment()
    }
}