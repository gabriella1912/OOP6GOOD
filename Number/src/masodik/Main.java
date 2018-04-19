package masodik;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import com.sun.xml.internal.ws.util.ReadAllStream;

public class Main {

	public static void main(String[] args) {
		
			final elso.Number realNum = new elso.Number (Math.random());
			
			boolean continueSearching= true;
			int index=0;
			while (continueSearching) {
				index++;
			double tempNumber= Math.random();
			if (realNum.isInThreshold(tempNumber)) {
				continueSearching=true;
			}
			
			}
			
			System.out.println(index+". try");

			realNum.setRealNum(0.5);
		//	realNum=new elso.Number(0.12);
	}

}
