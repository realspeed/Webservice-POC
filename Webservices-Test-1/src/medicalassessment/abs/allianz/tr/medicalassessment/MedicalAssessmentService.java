
package medicalassessment.abs.allianz.tr.medicalassessment;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MedicalAssessmentService", targetNamespace = "http://tr.allianz.abs.medicalAssessment/medicalAssessment/", wsdlLocation = "file:/C:/Users/Dhananjay%20Samanta/Desktop/java9/SOAP-WS-RI_IMPL/SOAP-WS-RI_IMPL/src/main/resources/wsdl/medicalAssessment.wsdl")
public class MedicalAssessmentService
    extends Service
{

    private final static URL MEDICALASSESSMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException MEDICALASSESSMENTSERVICE_EXCEPTION;
    private final static QName MEDICALASSESSMENTSERVICE_QNAME = new QName("http://tr.allianz.abs.medicalAssessment/medicalAssessment/", "MedicalAssessmentService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Dhananjay%20Samanta/Desktop/java9/SOAP-WS-RI_IMPL/SOAP-WS-RI_IMPL/src/main/resources/wsdl/medicalAssessment.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MEDICALASSESSMENTSERVICE_WSDL_LOCATION = url;
        MEDICALASSESSMENTSERVICE_EXCEPTION = e;
    }

    public MedicalAssessmentService() {
        super(__getWsdlLocation(), MEDICALASSESSMENTSERVICE_QNAME);
    }

    public MedicalAssessmentService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MEDICALASSESSMENTSERVICE_QNAME, features);
    }

    public MedicalAssessmentService(URL wsdlLocation) {
        super(wsdlLocation, MEDICALASSESSMENTSERVICE_QNAME);
    }

    public MedicalAssessmentService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MEDICALASSESSMENTSERVICE_QNAME, features);
    }

    public MedicalAssessmentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MedicalAssessmentService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MedicalAssessment
     */
    @WebEndpoint(name = "medicalAssessmentSOAP")
    public MedicalAssessment getMedicalAssessmentSOAP() {
        return super.getPort(new QName("http://tr.allianz.abs.medicalAssessment/medicalAssessment/", "medicalAssessmentSOAP"), MedicalAssessment.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MedicalAssessment
     */
    @WebEndpoint(name = "medicalAssessmentSOAP")
    public MedicalAssessment getMedicalAssessmentSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://tr.allianz.abs.medicalAssessment/medicalAssessment/", "medicalAssessmentSOAP"), MedicalAssessment.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MEDICALASSESSMENTSERVICE_EXCEPTION!= null) {
            throw MEDICALASSESSMENTSERVICE_EXCEPTION;
        }
        return MEDICALASSESSMENTSERVICE_WSDL_LOCATION;
    }

}
