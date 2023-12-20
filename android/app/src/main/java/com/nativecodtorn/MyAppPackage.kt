package com.nativecodtorn

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager
import com.nativecodtorn.module.ImagePickerModule
import com.nativecodtorn.module.pushCalendModule.CalendarModule
import com.nativecodtorn.screen.ModuleNativeScreen

class MyAppPackage : ReactPackage {

    // This package manager in application
    // To add a new native module, simply add it to the createNativeModules return sheet

    override fun createViewManagers(
        reactContext: ReactApplicationContext
    ): MutableList<ViewManager<View, ReactShadowNode<*>>> = mutableListOf()

    override fun createNativeModules(
        reactContext: ReactApplicationContext
    ): MutableList<NativeModule> = listOf(
        CalendarModule(reactContext),
        ImagePickerModule(reactContext),
        ModuleNativeScreen(reactContext)
    ).toMutableList()
}