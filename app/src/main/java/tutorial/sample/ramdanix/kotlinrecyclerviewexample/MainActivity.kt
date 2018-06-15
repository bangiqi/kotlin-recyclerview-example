package tutorial.sample.ramdanix.kotlinrecyclerviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // inisialisasi Arraylist kosong yang nantinya akan diisi data nama bulan hijriyah
    val bulanHijriah: ArrayList<String> = ArrayList()

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listBulanHijriah()

        viewManager = LinearLayoutManager(this)
        viewAdapter = BulanHijriyahAdapter(bulanHijriah, this)

        recyclerView = findViewById(R.id.rv_bulan_hijriah)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = viewAdapter
    }

    fun listBulanHijriah(){
        bulanHijriah.add("Muharram")
        bulanHijriah.add("Safar")
        bulanHijriah.add("Rabiul awal")
        bulanHijriah.add("Rabiul akhir")
        bulanHijriah.add("Jumadil awal")
        bulanHijriah.add("Jumadil akhir")
        bulanHijriah.add("Rajab")
        bulanHijriah.add("Sya'ban")
        bulanHijriah.add("Ramadhan")
        bulanHijriah.add("Rajab")
        bulanHijriah.add("Syawal")
        bulanHijriah.add("Dzulkaidah")
        bulanHijriah.add("Dzulhijjah")
    }
}
