package jCalculatorPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worker {
	
	Worker(){
		
	}
	
	public void calculate(String param) {
		param = param.replaceAll(" ", "");	//remove all white-spaces(blanks)
		
		
		int ergebnis = 0;
        int ersteZahl = getErsteOderZweiteZahl(param, 0);
        int zweiteZahl = getErsteOderZweiteZahl(param,2);
        String operation = getOperator(param);

        
        ergebnis = ersteZahl
                + zweiteZahl;
        
		
		
		
		System.out.println(Integer.toString(ergebnis));
	}

	private String getOperator(String param) {
		Pattern p = Pattern.compile("[-+\\\\/*]");
		Matcher m = p.matcher(param);
		
		
		List<String> liste = new ArrayList<String>();
		while(m.find()) {
			liste.add(m.group());
		}
		
		return liste.get(0);
	}

	private int getErsteOderZweiteZahl(String param, int i) {
		// TODO Auto-generated method stub	
		Pattern p = Pattern.compile("\\d*");
		Matcher m = p.matcher(param);
		
		
		List<String> liste = new ArrayList<String>();
		while(m.find()) {
			liste.add(m.group());
		}
		
        return Integer.parseInt(liste.get(i));
	}
	
	
	
}
