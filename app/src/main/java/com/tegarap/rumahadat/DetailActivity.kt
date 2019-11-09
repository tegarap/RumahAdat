package com.tegarap.rumahadat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "rumah_name"
        const val EXTRA_DETAIL = "rumah_detail"
        const val EXTRA_PHOTO = "rumah_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        //actionbar
        val actionbar = supportActionBar
        actionbar!!.title = name
        actionbar.setDisplayHomeAsUpEnabled(true)

        tampilDetail(photo, detail)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun tampilDetail(photo: Int, detail: String?){
        Glide.with(this)
            .load(photo)
            .into(iv_rumah_adat)

        tv_rumah_adat.text = detail
    }
}
