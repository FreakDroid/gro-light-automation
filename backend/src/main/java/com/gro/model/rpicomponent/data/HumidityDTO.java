package com.gro.model.data.humidity;

import java.util.Date;

import com.gro.model.data.AbstractDataDTO;

public class HumidityDTO extends AbstractDataDTO {

    private Double humidity;
    
    public HumidityDTO() {}
    
    public HumidityDTO(Date timestamp, Double humidity) {
        super(timestamp);
        this.humidity = humidity;
    }
    
    public HumidityDTO(Date timestamp, Double humidity, Integer componentId) {
        super(timestamp, componentId);
        this.humidity = humidity;
    }
    
    public Double getHumidity() {
        return humidity;
    }
    
    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }
    
}
