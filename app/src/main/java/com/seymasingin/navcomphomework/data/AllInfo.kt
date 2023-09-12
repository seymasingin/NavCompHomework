package com.seymasingin.navcomphomework.data

import android.os.Parcelable
import android.text.Editable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AllInfo(var personalInfo: PersonalInfo, var job: String, var place: String, var age: Int)
    : Parcelable