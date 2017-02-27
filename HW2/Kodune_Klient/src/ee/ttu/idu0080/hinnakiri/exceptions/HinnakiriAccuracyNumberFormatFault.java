package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HinnakiriAccuracyNumberFormatFault")
public class HinnakiriAccuracyNumberFormatFault {
	private String message;

	public HinnakiriAccuracyNumberFormatFault() {}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;

	}
}
