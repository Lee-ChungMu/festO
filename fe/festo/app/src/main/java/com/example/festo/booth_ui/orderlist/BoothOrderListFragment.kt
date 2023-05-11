package com.example.festo.booth_ui.orderlist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.festo.R
import com.example.festo.customer_ui.home.NotificationFragment
import com.example.festo.data.API.BoothAPI
import com.example.festo.data.res.BoothOrderListRes
import com.example.festo.databinding.FragmentBoothOrderlistBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BoothOrderListFragment : Fragment() {
    private  lateinit var listAdapter: BoothOrderListAdapter
    private var retrofit = RetrofitClient.client
    private var orderListData = emptyList<BoothOrderListRes>()
    private var mBinding : FragmentBoothOrderlistBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentBoothOrderlistBinding.inflate(inflater, container, false)

        mBinding = binding

        mBinding!!.orerlistBtn2.setOnClickListener{
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.booth_layout_nav_bottom, BoothOrderListCompleteFragment())
            transaction?.commit()
        }

        return  mBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fun getBoothOrderList() {
            Log.d(" 실행타이밍", "지금")
            val postApi = retrofit?.create(BoothAPI::class.java)
            postApi!!.getBoothOrderList("2").enqueue(object : Callback<List<BoothOrderListRes>> {
                override fun onResponse(call: Call<List<BoothOrderListRes>>, response: Response<List<BoothOrderListRes>>) {
                    if (response.isSuccessful) {
                        orderListData = response.body()!!
                        listAdapter = BoothOrderListAdapter(orderListData as MutableList<BoothOrderListRes>)
                        mBinding?.boothOrderlistFragmentListview?.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
                        mBinding?.boothOrderlistFragmentListview?.adapter = listAdapter
//                    Log.d("테스트중", "onResponse: ${response.body()}")
                        Log.d(" 부스 주문내역 과연", "${response},  ${response.body()}")
                    }
                    else {
                        Log.d(" 부스 주문내역 successful 아닐때", "${response},  ${response.code()}")
                    }
                }
                override fun onFailure(call: Call<List<BoothOrderListRes>>, t: Throwable) {
                    Log.d(" 부스 주문내역 실패", "응")
                    t.printStackTrace()
                }
            })
        }
        getBoothOrderList()
    }

    override fun onDestroyView() {
        mBinding = null
        super.onDestroyView()
    }
}