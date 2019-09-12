package com.droiddigger.customviewskotlin

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class ProfileView(context: Context, attributes: AttributeSet) : LinearLayout(context, attributes) {

    init {
        View.inflate(context, R.layout.profile_view, this)

        val profileImage: ImageView = findViewById(R.id.image)
        val profieTitle: TextView = findViewById(R.id.caption)

        val attr = context.obtainStyledAttributes(attributes, R.styleable.ProfileView)

        profileImage.setImageDrawable(attr.getDrawable(R.styleable.ProfileView_image))
        profieTitle.setText(attr.getText(R.styleable.ProfileView_text))
        attr.recycle()
    }
}