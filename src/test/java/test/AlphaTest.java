package test;

import page.*;
import org.testng.annotations.Test;
import service.RegionCreator;

public class AlphaTest extends CommonConditions {
    @Test(description = "Найти самые популярные мужские чёрные бомберы размера XL")
    public void Test1(){
        new HomePage(driver).openPage()
                .openSearch()
                .openSearchResultPage("bomber")
                .filtersButtonClick()
                .selectBlackColor()
                .selectXLSize()
                .filtersButtonClick()
                .openOrderByDropdownMenu()
                .selectOrderByMostPopular();
    }

    // @Test(description = "Найти мужскую верхнюю одежду белого цвета и отсортировать от самых дешёвых")
    // public void Test2() {
    //     new HomePage(driver).openPage()
    //             .openMenPage()
    //             .openMensOuterwearPage()
    //             .clickToColorFilter()
    //             .selectWhiteColor();
    // }
}