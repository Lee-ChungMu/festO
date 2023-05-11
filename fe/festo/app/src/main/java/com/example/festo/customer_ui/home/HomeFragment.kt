package com.example.festo.customer_ui.home



import RetrofitClient
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log

import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.festo.R
import com.example.festo.customer_ui.search.SearchActivity
import com.example.festo.data.API.UserAPI
import com.example.festo.data.res.FestivalListRes
import com.example.festo.databinding.FragmentHomeBinding
import retrofit2.Call
import retrofit2.Response
import com.example.festo.data.res.FestivalListRes as FestivalListRes1


class HomeFragment : Fragment() {
    private var retrofit = RetrofitClient.client
    private var festivalList = emptyList<FestivalListRes>()

    private var mBinding: FragmentHomeBinding? = null
    private var festivalItemData = ArrayList<HomeFestivalList>()
    private lateinit var listAdapter: FestivalItemListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentHomeBinding.inflate(inflater, container, false)
        mBinding = binding

        /*mBinding!!.testBtn.setOnClickListener {
          *//*  val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.layout_nav_bottom, FestivallistFragment())
            transaction?.commit()*//*
            val intent = Intent(getActivity(), BoothDetailActivity::class.java)
            startActivity(intent)
//            return@setOnClickListener inflater.inflate(R.layout.fragment_festivallist, container, false)
        }*/

        mBinding!!.notificationBtn.setOnClickListener{
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.layout_nav_bottom, NotificationFragment())
            transaction?.commit()
        }

        // 검색창 클릭시 검색 액티비티로 이동
        mBinding!!.searchView.setOnQueryTextFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                val intent = Intent(requireActivity(), SearchActivity::class.java)
                requireActivity().startActivity(intent)
            }
        }
        return mBinding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val api = retrofit?.create(UserAPI::class.java)
        val sharedPreferences = requireContext().getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val myValue = sharedPreferences.getString("myToken", "")
        val token = "$myValue"
        api!!.getFestivalList(token).enqueue(object:retrofit2.Callback<List<FestivalListRes>> {
            override fun onResponse(
                call: Call<List<FestivalListRes>>,
                response: Response<List<FestivalListRes>>
            ) {
                if (response.isSuccessful) {
                    Log.i("성공다", "${response.body()}")
                    festivalList = response.body()?: emptyList()
                    // 리스트 연결
                    listAdapter = FestivalItemListAdapter(festivalList)
                    mBinding?.festivalRecyclerView?.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
                    mBinding?.festivalRecyclerView?.adapter = listAdapter

                }
            }
            override fun onFailure(call: Call<List<FestivalListRes>>, t: Throwable) {
                Log.i("실패다", "$t")
            }

        })
        /*var FestivalItemListData: ArrayList<HomeFestivalList> = arrayListOf(
            HomeFestivalList(R.drawable.festival1, "a유등축제"),
            HomeFestivalList(R.drawable.festival2, "b광양 전통숯불구이 축제"),
            HomeFestivalList(R.drawable.festival1, "c유등축제"),
            HomeFestivalList(R.drawable.festival2, "d광양 전통숯불구이 축제"),
            HomeFestivalList(R.drawable.festival1, "e유등축제"),
            HomeFestivalList(R.drawable.festival2, "f광양 전통숯불구이 축제"),
            HomeFestivalList(R.drawable.festival1, "g유등축제"),
            HomeFestivalList(R.drawable.festival2, "h광양 전통숯불구이 축제"),
        )
        listAdapter = FestivalItemListAdapter(FestivalItemListData)
        mBinding?.festivalRecyclerView?.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        mBinding?.festivalRecyclerView?.adapter = listAdapter*/
    }

    override fun onDestroyView() {
        mBinding = null
        super.onDestroyView()
    }
}