package medicalassessment.abs.allianz.tr.medicalassessment;

import javax.jws.WebService;

import medicalassessment.abs.allianz.tr.medicalassessment.datamodel.MedicalAssessmentRequest;
import medicalassessment.abs.allianz.tr.medicalassessment.datamodel.MedicalAssessmentResponse;

@WebService(endpointInterface="medicalassessment.abs.allianz.tr.medicalassessment.MedicalAssessment",serviceName="MedicalAssessmentService",portName="medicalAssessmentSOAP")
public class MedicalAssessmentImpl{
	public MedicalAssessmentResponse getMedicalAssessmentStatus(MedicalAssessmentRequest parameters) {
		System.out.println("Description :: "+parameters.getDescription()+"\n PolicyNo :: "+parameters.getPolicyNumber());
		
		MedicalAssessmentResponse response=new MedicalAssessmentResponse();
		response.setResultCode("00");
		response.setResultDescription("Success");
		return response;
	}

}
