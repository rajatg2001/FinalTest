package org.example.project

import platform.UIKit.UIDevice
import cocoapods.FLEX.FLEXManager
import kotlinx.cinterop.ExperimentalForeignApi

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion

    @OptIn(ExperimentalForeignApi::class)
    fun showFlexExplorer() {
        // Just shows the FLEX debug explorer
        FLEXManager.sharedManager().showExplorer()
    }
}

actual fun getPlatform(): Platform = IOSPlatform()