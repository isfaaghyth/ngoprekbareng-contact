package app.isfaaghyth.contact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var txtName: TextView? = null
    private var btnDetail: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtName = findViewById(R.id.txt_name)
        btnDetail = findViewById(R.id.btn_detail)

        btnDetail?.setOnClickListener {
            val detailIntent = Intent(this, DetailActivity::class.java)
            startActivity(detailIntent)
        }
    }

    override fun onPause() {
        super.onPause()
        txtName?.text = "wah, aplikasinya di minimize"
    }

}