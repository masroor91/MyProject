
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

@XmlRootElement(name = "getTempByWeatherResponse", namespace = "http://service.mas.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTempByWeatherResponse", namespace = "http://service.mas.com/")

public class GetTempByWeatherResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

