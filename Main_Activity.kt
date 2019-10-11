package com.example.listviewicon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Presiden Pertama", "Ir.Soekarno", R.drawable.presiden_sukarno))
        list.add(Model("Presiden Kedua", "Jend. TNI Purn. H.M. Soeharto", R.drawable.soeharto))
        list.add(Model("Preside Ketiga", "Bj Habibie", R.drawable.habibie))
        list.add(Model("Presiden Keempat", "Abdurahman Wahid", R.drawable.gusdur))
        list.add(Model("Presiden Kelima", "Megawati Soekarno P", R.drawable.megawati))
        list.add(Model("Presiden Keenam", "Susilo Bambang Yudhoyono", R.drawable.sby))
        list.add(Model("Presiden Ketujuh", "Joko Widodo", R.drawable.jokowi))

        listview.adapter = MyListAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent, view, position, id ->

            if (position == 0) {
                val intent= Intent(this, Soekarno::class.java)
                startActivity(intent)
            }
            if (position == 1) {
                val intent= Intent(this, soeharto::class.java)
                startActivity(intent)
            }
            if (position == 2) {
                val intent= Intent(this, habibie::class.java)
                startActivity(intent)
            }
            if (position == 3) {
                val intent= Intent(this, gusdur::class.java)
                startActivity(intent)
            }
            if (position == 4) {
                val intent= Intent(this, megawati::class.java)
                startActivity(intent)

            }
            if (position == 5) {
                val intent= Intent(this, sby::class.java)
                startActivity(intent)
            }
            if (position == 6) {
                val intent= Intent(this, jokowi::class.java)
                startActivity(intent)
            }
        }
    }
}
