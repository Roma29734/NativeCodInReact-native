package com.nativecodtorn.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.nativecodtorn.R


// Native Fragment
class MainAppFragment : Fragment(R.layout.fragment_main_app) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstButton: Button = view.findViewById(R.id.next_screen_button)

        val secondButton: Button = view.findViewById(R.id.another_screen_button)

        firstButton.setOnClickListener {
            this.onButtonPress()
        }
        secondButton.setOnClickListener {
            this.onSecondButtonPress()
        }
    }

    private fun onButtonPress() {
        findNavController().navigate(R.id.firstFragment)
    }

    private fun onSecondButtonPress() {
        findNavController().navigate(R.id.secondFragment)
    }

}