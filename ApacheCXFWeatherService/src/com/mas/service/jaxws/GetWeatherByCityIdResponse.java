
package com.mas.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Sat Nov 12 20:44:13 IST 2016
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "getWeatherByCityIdResponse", namespace = "http://service.mas.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWeatherByCityIdResponse", namespace = "http://service.mas.com/")

public class GetWeatherByCityIdResponse {

    @XmlElement(name = "return")
    private com.mas.service.Weather _return;

    public com.mas.service.Weather getReturn() {
        return this._return;
    }

    public void setReturn(com.mas.service.Weather new_return)  {
        this._return = new_return;
    }

}

