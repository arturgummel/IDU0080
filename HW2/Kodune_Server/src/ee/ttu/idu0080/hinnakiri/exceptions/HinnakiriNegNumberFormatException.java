package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriNegNumberFormatFault")
public class HinnakiriNegNumberFormatException extends Exception {
	private HinnakiriNegNumberFormatFault faultInfo;
	public HinnakiriNegNumberFormatException() {
		this("Number is in an incorrect format");
	}
	public HinnakiriNegNumberFormatException(String message) {
		super(message);
		faultInfo = new HinnakiriNegNumberFormatFault();
		faultInfo.setMessage(message);
	}
	public HinnakiriNegNumberFormatException(String message, HinnakiriNegNumberFormatFault faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}
	public HinnakiriNegNumberFormatFault getFaultInfo() {
		return faultInfo;
	}
}
