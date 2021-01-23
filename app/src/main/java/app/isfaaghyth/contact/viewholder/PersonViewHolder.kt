package app.isfaaghyth.contact.viewholder

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.isfaaghyth.contact.DetailActivity
import app.isfaaghyth.contact.R
import app.isfaaghyth.contact.model.Person

class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val imgAvatar: ImageView = view.findViewById(R.id.img_avatar)
    private val txtName: TextView = view.findViewById(R.id.txt_name)
    private val txtDetail: TextView = view.findViewById(R.id.txt_detail)

    fun bindPerson(person: Person) {
        imgAvatar.setImageResource(person.avatar)
        txtName.text = person.fullName
        txtDetail.text = "${person.relation} - ${person.emailAddress}"

        itemView.setOnClickListener {
            val intent = Intent(itemView.context, DetailActivity::class.java)
            intent.putExtra("person_detail", person)
            itemView.context.startActivity(intent)
        }
    }

}