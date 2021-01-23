package app.isfaaghyth.contact.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(
    val avatar: Int,
    val fullName: String,
    val relation: String,
    val emailAddress: String,
    val phoneNumber: String
) : Parcelable