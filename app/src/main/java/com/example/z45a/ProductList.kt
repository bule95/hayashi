// いっかいめのPUSH

package com.example.z45a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_product_list.*

class ProductList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        //一覧するデータを準備
        val dates = arrayOf("AAA", "BBB", "CCC")
        //アダプタはandroid既成の配列用アダプタ
        val arrayAdapter = ArrayAdapter<String>(this, R.layout.plist_row, dates)
        //plist_rowにアダプタを設定
        PList.adapter = arrayAdapter


//    //一覧項目の一つをクリックし、ポップアップ表示
//    if (dates.isEmpty()){
//        //一覧するデータが存在しない場合
//        PList.visibility = View.GONE //ビューの表示を消す
//        emptyMessage.visibility = View.VISIBLE //ビューを表示する
//    } else {
//      //一覧表示するデータが存在する場合通常通りアダプタを準備して一覧を作成
//        PList.adapter = arrayAdapter
//    }
    }
}