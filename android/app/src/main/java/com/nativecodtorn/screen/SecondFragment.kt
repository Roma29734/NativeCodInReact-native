package com.nativecodtorn.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import com.nativecodtorn.R

// Native Fragment
class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val closeButton: Button = view.findViewById(R.id.close_button)

        closeButton.setOnClickListener {
            this.onCloseButtonPress()
        }
    }

    private fun onCloseButtonPress() {
        activity?.finish();
    }

}