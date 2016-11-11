package com.mas.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-11-11T18:17:17.827+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "CalServiceService", 
                  wsdlLocation = "http://localhost:8080/ApcaheCXFCalService/services/CalServicePort?wsdl",
                  targetNamespace = "http://service.mas.com/") 
public class CalServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.mas.com/", "CalServiceService");
    public final static QName CalServicePort = new QName("http://service.mas.com/", "CalServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ApcaheCXFCalService/services/CalServicePort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CalServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ApcaheCXFCalService/services/CalServicePort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CalServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CalServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CalServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CalServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CalServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CalService
     */
    @WebEndpoint(name = "CalServicePort")
    public CalService getCalServicePort() {
        return super.getPort(CalServicePort, CalService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalService
     */
    @WebEndpoint(name = "CalServicePort")
    public CalService getCalServicePort(WebServiceFeature... features) {
        return super.getPort(CalServicePort, CalService.class, features);
    }

}