package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    private val newsAdapter:NewsAdapter by lazy { NewsAdapter() }
    private var dataItem= mutableListOf<NewsDetail>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        init()
        setData()
    }
    private fun init(){
        binding?.rvNewsData?.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=newsAdapter
        }
    }
    private fun setData(){
        dataItem.addAll(listOf(NewsDetail("Example","adtgt","sretdcfsewqa")))
        dataItem.addAll(listOf(NewsDetail("Example1","adtgt","sretdcfsewqa")))
        dataItem.addAll(listOf(NewsDetail("Example2","adtgt","sretdcfsewqa")))
        dataItem.addAll(listOf(NewsDetail("Example3","adtgt","sretdcfsewqa")))
        dataItem.addAll(listOf(NewsDetail("Example3","adtgt","sretdcfsewqa")))
        dataItem.addAll(listOf(NewsDetail("Example3","adtgt","sretdcfsewqa")))
        dataItem.addAll(listOf(NewsDetail("Example3","adtgt","sretdcfsewqa")))
        newsAdapter.updateList(dataItem)
    }

}