package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "HinnakiriNullNumberFormatFault")
public class HinnakiriNullNumberFormatFault {

	private String message;

    public HinnakiriNullNumberFormatFault() { }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
