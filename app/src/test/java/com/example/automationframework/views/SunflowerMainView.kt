package com.example.automationframework.views

import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory
import io.appium.java_client.android.AndroidDriver
import com.example.automationframework.Locators
import io.appium.java_client.MobileElement

class SunflowerMainView (private val driver: AndroidDriver<MobileElement>){

    init { PageFactory.initElements(AppiumFieldDecorator(driver), this) }

    //    elems
    private val myGardenBtn = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"My garden\"]/android.widget.TextView\n"

    private val plantListBtn = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Plant list\"]/android.widget.TextView\n"

    private val sunflowerHdr = "//android.widget.FrameLayout[@content-desc=\"Sunflower\"]/android.view.ViewGroup/android.widget.TextView\n"

    //    properties
    fun getSunflowerHdr() :String = Locators(driver).visibleXPath(sunflowerHdr).text

    fun getMyGardenSelectedStatus() :String = Locators(driver).visibleXPath(myGardenBtn).getAttribute("selected")

    //    actions
    fun tapPlantList() = Locators(driver).clickableElemXPath(plantListBtn).click()

    fun tapMyGarden() = Locators(driver).clickableElemXPath(myGardenBtn).click()
}