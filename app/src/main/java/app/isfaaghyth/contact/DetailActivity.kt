package app.isfaaghyth.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import app.isfaaghyth.contact.model.Person

class DetailActivity : AppCompatActivity() {

    private var txtName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        txtName = findViewById(R.id.txt_name)

        intent.extras?.let {
            val person = it.getParcelable<Person>("person_detail")
            txtName?.text = person?.fullName
        }
    }

}