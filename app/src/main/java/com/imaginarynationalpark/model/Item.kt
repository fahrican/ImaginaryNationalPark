package com.imaginarynationalpark.model

import android.os.Parcel
import android.os.Parcelable

data class Item(
    val endDate: String?,
    val id: String?,
    val price: String?,
    val shortDescription: String?,
    val startDate: String?,
    val thumb: String?,
    val title: String?
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(endDate)
        parcel.writeString(id)
        parcel.writeString(price)
        parcel.writeString(shortDescription)
        parcel.writeString(startDate)
        parcel.writeString(thumb)
        parcel.writeString(title)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Item> {
        override fun createFromParcel(parcel: Parcel): Item {
            return Item(parcel)
        }

        override fun newArray(size: Int): Array<Item?> {
            return arrayOfNulls(size)
        }
    }
}