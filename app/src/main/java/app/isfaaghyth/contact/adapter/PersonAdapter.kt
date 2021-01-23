package app.isfaaghyth.contact.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.isfaaghyth.contact.R
import app.isfaaghyth.contact.model.Person
import app.isfaaghyth.contact.viewholder.PersonViewHolder

class PersonAdapter(private val persons: List<Person>) : RecyclerView.Adapter<PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val personView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_person, parent, false)

        return PersonViewHolder(personView)
    }

    override fun getItemCount(): Int {
        return persons.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindPerson(persons[position])
    }

}