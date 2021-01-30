package app.isfaaghyth.contact.model

import com.google.gson.annotations.SerializedName

data class PersonData(
    @SerializedName("success")
    val success: Boolean,

    @SerializedName("data")
    val dataPerson: List<Person>
)