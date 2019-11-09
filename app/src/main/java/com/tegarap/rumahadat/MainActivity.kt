package com.tegarap.rumahadat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val listRumahAdat = ArrayList<RumahAdat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_rumah_adat.setHasFixedSize(true)

        listRumahAdat.addAll(RumahAdatData.listDataRumahAdat)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
                val intent = Intent(this,AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }


    private fun showRecyclerList() {
        rv_rumah_adat.layoutManager = LinearLayoutManager(this)
        val listRumahAdatAdapter = ListRumahAdatAdapter(listRumahAdat)
        rv_rumah_adat.adapter = listRumahAdatAdapter

        listRumahAdatAdapter.setOnItemClickCallback(object : ListRumahAdatAdapter.OnItemClickCallback {
            override fun onItemClicked(data: RumahAdat) {
                selectedRumahAdat(data)
            }
        })
    }

    private fun selectedRumahAdat(rumahAdat: RumahAdat) {
        //Intent ke DetailActivity
//        Toast.makeText(this, "Kamu memilih " + rumahAdat.nama, Toast.LENGTH_SHORT).show()
        val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra("rumah_name", rumahAdat.nama)
        intent.putExtra("rumah_detail", rumahAdat.keterangan)
        intent.putExtra("rumah_photo", rumahAdat.gambar)
        startActivity(intent)
    }
}
