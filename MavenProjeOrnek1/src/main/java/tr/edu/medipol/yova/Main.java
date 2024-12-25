package tr.edu.medipol.yova;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		
		String ornekMetin = " Y A Z I L I M ";
		
		 String sonuc = StringUtils.deleteWhitespace(ornekMetin);
		
		System.out.println("\"" + ornekMetin + "\" --> \"" + sonuc + "\"");

	}

}
