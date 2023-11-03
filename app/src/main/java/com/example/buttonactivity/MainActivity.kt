package com.example.buttonactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.AbsoluteSizeSpan
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*        val button1 = findViewById<Button>(R.id.button1)
        val nonVisibleButtonsContainer = findViewById<LinearLayout>(R.id.nonVisibleButtonsContainer)
        button1.setOnClickListener {
            // Toggle the visibility of the non-vis ible buttons container
            nonVisibleButtonsContainer.visibility = if (nonVisibleButtonsContainer.visibility == View.VISIBLE) {
                View.GONE
            } else {
                View.VISIBLE
            }
        }*/
        val camera_setting = findViewById<Button>(R.id.camera_setting)
        val upsideText = "Camera Setting"
        val downsideText = "Manage Camera Setting"
        val spannableText = SpannableStringBuilder()
        val upsideSize = 20 // Change to your desired size in SP
        spannableText.append(upsideText)
        spannableText.setSpan(AbsoluteSizeSpan(upsideSize, true), 0, upsideText.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableText.append("\n")
        val downsideSize = 14 // Change to your desired size in SP
        spannableText.append(downsideText)
        spannableText.setSpan(AbsoluteSizeSpan(downsideSize, true), upsideText.length + 1, spannableText.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        camera_setting.text = spannableText

        val alert_setting = findViewById<Button>(R.id.alert_setting)
        val alertUpsideText = "Alert Setting"
        val alertDowntSideText = "Manage Alerts"
        val alertSettingText = SpannableStringBuilder()
        alertSettingText.append(alertUpsideText)
        alertSettingText.setSpan(AbsoluteSizeSpan(upsideSize, true), 0, alertUpsideText.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        alertSettingText.append("\n")
        alertSettingText.append(alertDowntSideText)
        alertSettingText.setSpan(AbsoluteSizeSpan(downsideSize, true), alertUpsideText.length + 1, alertSettingText.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        alert_setting.text = alertSettingText
    }
}