package br.com.leonardomiyagi.kotlindialogutils

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.leonardomiyagi.dialogutils.DialogUtils
import kotlinx.android.synthetic.main.activity_sample.*

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        showOkDialogButton.setOnClickListener {
            DialogUtils.showOkDialog(this, "Sample Title", "This should have only an OK button.")
        }
        showOkCancelDialogButton.setOnClickListener {
            DialogUtils.showOkCancelDialog(this, "Sample Title", "This should have an OK and a Cancel button.")
        }
        showCustomDialog.setOnClickListener {
            DialogUtils.showDialog(
                    this,
                    "Sample Title",
                    "You can customize stuff, but also leave some things out.",
                    "Got it",
                    "Nah",
                    "Maybe",
                    { showToast("Glad you got it!") },
                    { showToast("Oh no, how can I help you?") },
                    { showToast("Ok, I believe you!") },
                    { showToast("Clicked outside, so this dialog was canceled") }
            )
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
