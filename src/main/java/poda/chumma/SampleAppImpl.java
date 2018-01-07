package poda.chumma;

import javax.jws.WebService;

@WebService(endpointInterface="poda.chumma.SampleApp", portName="sampleAppPort", serviceName="sampleAppService") 
public class SampleAppImpl implements SampleApp {

	public String show(String value) {
		return "Hey! Good to see Mr. " + value + "...";
	}

}
