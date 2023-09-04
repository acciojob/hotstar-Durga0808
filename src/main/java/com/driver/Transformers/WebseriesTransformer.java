package com.driver.Transformers;

import com.driver.EntryDto.WebSeriesEntryDto;
import com.driver.model.WebSeries;

public class WebseriesTransformer {
    public static WebSeries convertDtoIntoEntity(WebSeriesEntryDto webSeriesEntryDto){
        WebSeries webSeries=new WebSeries(
                webSeriesEntryDto.getSeriesName(),
                webSeriesEntryDto.getAgeLimit(),
                webSeriesEntryDto.getRating(),
                webSeriesEntryDto.getSubscriptionType()
        );
        return webSeries;
    }
}
