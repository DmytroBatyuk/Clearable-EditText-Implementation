package ua.batyuk.dmytro.clearableedittextimplementation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username_text)
        username.makeClearableEditText(null, null)

        val password = findViewById<EditText>(R.id.password_text)
        password.makeClearableEditText(null, null)

// Uncomment that code if want add right cancel drawable to EditText programmatically
//        addRightCancelDrawable(findViewById(R.id.username_text))
//        addRightCancelDrawable(findViewById(R.id.password_text))
    }

    private fun addRightCancelDrawable(editText: EditText) {
        val cancel = ContextCompat.getDrawable(this, R.drawable.ic_cancel_black_24dp)
        cancel?.setBounds(0,0, cancel.intrinsicWidth, cancel.intrinsicHeight)
        editText.setCompoundDrawables(null, null, cancel, null)
    }
}
