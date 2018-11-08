package com.trendyol.medusalib.navigator

import android.support.v4.app.Fragment


class UniqueTagCreator : TagCreator {

    override fun create(fragment: Fragment): String =
            with(StringBuilder()) {
                append(fragment.javaClass.name)
                append(TAG_DIVIDER)
                append(fragment.hashCode())
                toString()
            }

    companion object {
        private const val TAG_DIVIDER = "-_-"
    }
}