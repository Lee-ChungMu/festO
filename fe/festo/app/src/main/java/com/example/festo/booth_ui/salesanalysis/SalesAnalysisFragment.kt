package com.example.festo.booth_ui.salesanalysis

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.festo.R
import com.example.festo.booth_ui.home.BoothHomeFragment
import com.example.festo.databinding.FragmentBoothSalesanalysisBinding
import com.example.festo.host_ui.boothlist.BoothListData
import com.example.festo.host_ui.boothlist.BoothlistAdapter
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet

class NewMenuData(
    var image: Int? = null,
    var name: String? = null,
)
class SalesAnalysisFragment : Fragment() {
    private lateinit var listAdapter: NewMenuListAdapter
    private var mBinding : FragmentBoothSalesanalysisBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentBoothSalesanalysisBinding.inflate(inflater, container, false)
        mBinding = binding

        // 차트 생성 코드
        val chart = binding.barChart

        fun basicSetting() {
            chart.apply {
                description.isEnabled = false
                setMaxVisibleValueCount(5) // 최대로 보여지는 데이터의 수
                setPinchZoom(false)
                setDrawBarShadow(false)
                setDrawGridBackground(false)
                setDrawBorders(false)
                legend.isEnabled = false
                setTouchEnabled(false)
                isDoubleTapToZoomEnabled = false
                animateY(5000) // 애니메이션 효과 적용 시간
            }
        }

        fun setxAxis() {
            val xAxis = chart.xAxis
            xAxis.apply {
                setDrawGridLines(false)
                isEnabled = true
                position = XAxis.XAxisPosition.BOTTOM
                disableGridDashedLine()
                setDrawAxisLine(false)
            }
        }

        fun setLeftXaxis() {
            val leftXaxis = chart.axisLeft
            leftXaxis.apply {
                setDrawGridLines(false)
                setDrawAxisLine(false)
                isEnabled = false
                setDrawLabels(false)
                axisMaximum = 600f
            }
        }

        fun setRightXaxis() {
            val rightXaxis = chart.axisRight
            rightXaxis.apply {
                setDrawGridLines(false)
                setDrawAxisLine(false)
                isEnabled = false
                setDrawLabels(false)
            }
        }

        fun createBarChart() {
            val values = ArrayList<BarEntry>()
            val type = ArrayList<String>()
            val colorList = ArrayList<Int>()
            val set : BarDataSet

            values.add(BarEntry(1.0f, 320.0f))
            values.add(BarEntry(2.0f, 430.0f))
            values.add(BarEntry(3.0f, 440.0f))
            values.add(BarEntry(4.0f, 300.0f))
            values.add(BarEntry(5.0f, 520.0f))

            type.add(" ")
            type.add("26일")
            type.add("27일")
            type.add("28일")
            type.add("29일")
            type.add("30일")

            colorList.add(Color.parseColor("#F24E1E"))

            if (chart.data != null && chart.data.dataSetCount > 1) {
                val chartData = chart.data
                set = chartData?.getDataSetByIndex(0) as BarDataSet
                set.values = values
                chartData.notifyDataChanged()
                chart.notifyDataSetChanged()
            } else {
                set = BarDataSet(values, " ")
                set.colors = colorList
                set.setDrawValues(true)

                val dataSets = ArrayList<IBarDataSet>()
                dataSets.add(set)

                val data = BarData(dataSets)
                chart.data = data
                chart.setVisibleXRange(1.0f,5.0f)
                chart.setFitBars(true)

                val xAxis = chart.xAxis
                xAxis.apply {
                    granularity = 1f
                    isGranularityEnabled = true
                    valueFormatter = IndexAxisValueFormatter(type)
                }
                chart.invalidate()
            }
        }

        basicSetting()
        setxAxis()
        setLeftXaxis()
        setRightXaxis()
        createBarChart()

        return mBinding?.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 전달받은 부스 아이디
        // 전달받은 부스 아이디
        val sharedPreferences = requireContext().getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val boothId = sharedPreferences.getString("boothId", "")


        var NewMenuDataList : ArrayList <NewMenuData> = arrayListOf(
            NewMenuData(R.drawable.logo1,"까사꼬치"),
            NewMenuData(R.drawable.logo2,"까사꼬치"),
            NewMenuData(R.drawable.logo3,"까사꼬치")
        )
        listAdapter = NewMenuListAdapter(NewMenuDataList)
        mBinding?.newMenuListView?.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        mBinding?.newMenuListView?.adapter = listAdapter
    }

    override fun onDestroyView() {
        mBinding = null
        super.onDestroyView()
    }
}