package app.isfaaghyth.contact.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(
    @SerializedName("avatar")
    val avatar: String,

    @SerializedName("fullname")
    val fullName: String,

    @SerializedName("relation")
    val relation: String,

    @SerializedName("email")
    val emailAddress: String?,

    @SerializedName("phone_number")
    val phoneNumber: String?
) : Parcelable