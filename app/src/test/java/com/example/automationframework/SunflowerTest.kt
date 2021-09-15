package com.example.automationframework

import org.junit.Test
import com.example.automationframework.views.SunflowerMainView
import org.junit.Assert.assertTrue

class SunflowerTest : Base(){

    @Test
    fun toggleToPlantListAndBack() {
        with(SunflowerMainView(driver)) {
            tapPlantList()
            assertTrue(getMyGardenSelectedStatus() == "false")
        }
    }
}