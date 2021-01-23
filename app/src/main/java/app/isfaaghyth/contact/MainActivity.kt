package app.isfaaghyth.contact

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import app.isfaaghyth.contact.adapter.PersonAdapter
import app.isfaaghyth.contact.model.Person

class MainActivity : AppCompatActivity() {

    private var rvPerson: RecyclerView? = null
    private var personAdapter: PersonAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvPerson = findViewById(R.id.rv_person)

        personAdapter = PersonAdapter(dataSetPerson())
        rvPerson?.adapter = personAdapter
    }

    private fun dataSetPerson(): List<Person> {
        return listOf(
            Person(
                R.mipmap.ic_launcher,
                "Muh Isfhani",
                "Family",
                "isfa@gmail.com",
                "123"
            ),
            Person(
                R.mipmap.ic_launcher,
                "Budi",
                "Co-workers",
                "budi@company.com",
                "456"
            ),
            Person(
                R.mipmap.ic_launcher,
                "Rani",
                "Family",
                "rani@gmail.com",
                "789"
            )
        )
    }

}