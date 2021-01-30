package app.isfaaghyth.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import app.isfaaghyth.contact.model.Person
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    private var imgAvatar: ImageView? = null
    private var txtName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        txtName = findViewById(R.id.txt_name)
        imgAvatar = findViewById(R.id.img_avatar_detail)

        intent.extras?.let {
            val person = it.getParcelable<Person>("person_detail")

            txtName?.text = person?.fullName

            imgAvatar?.let { imgAvatar ->
                Glide.with(this)
                    .load(person?.avatar)
                    .into(imgAvatar)
            }
        }
    }

}