
package com.mas.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mas.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWeatherByCityId_QNAME = new QName("http://service.mas.com/", "getWeatherByCityId");
    private final static QName _GetWeatherByCityIdResponse_QNAME = new QName("http://service.mas.com/", "getWeatherByCityIdResponse");
    private final static QName _GetTempByWeather_QNAME = new QName("http://service.mas.com/", "getTempByWeather");
    private final static QName _GetTempByWeatherResponse_QNAME = new QName("http://service.mas.com/", "getTempByWeatherResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mas.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTempByWeatherResponse }
     * 
     */
    public GetTempByWeatherResponse createGetTempByWeatherResponse() {
        return new GetTempByWeatherResponse();
    }

    /**
     * Create an instance of {@link GetWeatherByCityId }
     * 
     */
    public GetWeatherByCityId createGetWeatherByCityId() {
        return new GetWeatherByCityId();
    }

    /**
     * Create an instance of {@link GetWeatherByCityIdResponse }
     * 
     */
    public GetWeatherByCityIdResponse createGetWeatherByCityIdResponse() {
        return new GetWeatherByCityIdResponse();
    }

    /**
     * Create an instance of {@link GetTempByWeather }
     * 
     */
    public GetTempByWeather createGetTempByWeather() {
        return new GetTempByWeather();
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherByCityId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mas.com/", name = "getWeatherByCityId")
    public JAXBElement<GetWeatherByCityId> createGetWeatherByCityId(GetWeatherByCityId value) {
        return new JAXBElement<GetWeatherByCityId>(_GetWeatherByCityId_QNAME, GetWeatherByCityId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherByCityIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mas.com/", name = "getWeatherByCityIdResponse")
    public JAXBElement<GetWeatherByCityIdResponse> createGetWeatherByCityIdResponse(GetWeatherByCityIdResponse value) {
        return new JAXBElement<GetWeatherByCityIdResponse>(_GetWeatherByCityIdResponse_QNAME, GetWeatherByCityIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTempByWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mas.com/", name = "getTempByWeather")
    public JAXBElement<GetTempByWeather> createGetTempByWeather(GetTempByWeather value) {
        return new JAXBElement<GetTempByWeather>(_GetTempByWeather_QNAME, GetTempByWeather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTempByWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mas.com/", name = "getTempByWeatherResponse")
    public JAXBElement<GetTempByWeatherResponse> createGetTempByWeatherResponse(GetTempByWeatherResponse value) {
        return new JAXBElement<GetTempByWeatherResponse>(_GetTempByWeatherResponse_QNAME, GetTempByWeatherResponse.class, null, value);
    }

}
