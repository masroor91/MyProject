
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.mas.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-11-11T18:17:17.638+05:30
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "CalServiceService",
                      portName = "CalServicePort",
                      targetNamespace = "http://service.mas.com/",
                      wsdlLocation = "http://localhost:8080/ApcaheCXFCalService/services/CalServicePort?wsdl",
                      endpointInterface = "com.mas.service.CalService")
                      
public class CalServiceImpl implements CalService {

    private static final Logger LOG = Logger.getLogger(CalServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.mas.service.CalService#add(int  arg0 ,)int  arg1 )*
     */
    public int add(int arg0,int arg1) { 
        LOG.info("Executing operation add");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            int _return = 0;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
