package com.example.datepickerspinnermodeexample

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            SpinnerDatePickerDialogFragment().show(supportFragmentManager, "")
        }
    }


    class SpinnerDatePickerDialogFragment: DialogFragment() {
        @RequiresApi(Build.VERSION_CODES.N)
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            return DatePickerDialog(requireContext(), R.style.MySpinnerDatePickerStyle,
                    DatePickerDialog.OnDateSetListener { p0, p1, p2, p3 ->  },
                    1,0,1)
        }
    }
}