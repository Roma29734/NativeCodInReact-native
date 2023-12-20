package com.nativecodtorn.module.pushCalendModule

import android.content.Intent
import android.util.Log
import android.widget.Toast
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.nativecodtorn.screen.ModuleNameActivity

class CalendarModule(reactContext: ReactApplicationContext) :
    ReactContextBaseJavaModule(reactContext) {

    // This is module native cod

    // setName method to module
    override fun getName(): String {
        return "CalendarModule"
    }


    // Example native toast
    @ReactMethod
    fun createCalendarEvent(
        name: String, location: String, myFailureCallback: Callback,
        mySuccessCallback: Callback
    ) {
        val eventId = 15
        try {
            Toast.makeText(
                reactApplicationContext,
                "this is toast name - $name",
                Toast.LENGTH_SHORT
            ).show()
            mySuccessCallback.invoke(eventId)
        } catch (e: Exception) {
            myFailureCallback.invoke("$e error")
        }
        Log.d("CalendarModule", "Create event called with name: $name and location: $location")

    }

    // Example native screen in react-native app
    @ReactMethod
    fun showView(promise: Promise) {
        val intent = Intent(reactApplicationContext, ModuleNameActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        reactApplicationContext.startActivity(intent)
        promise.resolve(true)
    }

    @ReactMethod
    fun showViewNavigateTo(text: String? = "", promise: Promise) {
        val intent = Intent(reactApplicationContext, ModuleNameActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.putExtra("screenId", text)
        reactApplicationContext.startActivity(intent)
        promise.resolve(true)
    }
}