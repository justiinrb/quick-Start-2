package com.jusdev.quickstart

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ImageDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_detail)
        if (intent.extras != null) {

            Glide.with(this).load(intent.getStringExtra("imageUrl")).into(findViewById(R.id.image_animal))
        }

    }
}