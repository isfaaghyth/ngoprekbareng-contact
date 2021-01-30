package app.isfaaghyth.contact

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import app.isfaaghyth.contact.adapter.PersonAdapter
import app.isfaaghyth.contact.model.Person
import app.isfaaghyth.contact.model.PersonData
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    private var rvPerson: RecyclerView? = null
    private var personAdapter: PersonAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvPerson = findViewById(R.id.rv_person)

        assets.open("persons.json")
            .bufferedReader()
            .use {
                val persons = Gson().fromJson(it.readText(), PersonData::class.java)
                if (persons.success) {
                    personAdapter = PersonAdapter(persons.dataPerson)
                    rvPerson?.adapter = personAdapter
                }
            }
    }

}