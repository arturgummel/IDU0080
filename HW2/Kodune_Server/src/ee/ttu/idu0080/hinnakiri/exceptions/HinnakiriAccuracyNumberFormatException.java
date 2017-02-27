package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;
@WebFault(name = "HinnakiriAccuracyNumberFormatFault")
public class HinnakiriAccuracyNumberFormatException extends Exception {
	private HinnakiriAccuracyNumberFormatFault faultInfo;
	public HinnakiriAccuracyNumberFormatException() {
		this("Number is in an incorrect format");
	}
	public HinnakiriAccuracyNumberFormatException(String message) {
		super(message);
		faultInfo = new HinnakiriAccuracyNumberFormatFault();
		faultInfo.setMessage(message);
	}
	public HinnakiriAccuracyNumberFormatException(String message, HinnakiriAccuracyNumberFormatFault faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}
	public HinnakiriAccuracyNumberFormatFault getFaultInfo() {
		return faultInfo;
	}
}