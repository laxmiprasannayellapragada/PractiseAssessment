package DateValidation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserMainCode {
	public static String getValidDate(String s) throws ParseException{
		String out=null;
		if(s.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}")){
			SimpleDateFormat d1=new SimpleDateFormat("dd-MM-yyyy");
			d1.parse(s);
			out="valid";
		}else if(s.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")){
			SimpleDateFormat d1=new SimpleDateFormat("dd/MM/yyyy");
			d1.parse(s);
			out="valid";
		}else if(s.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}")){
			SimpleDateFormat d1=new SimpleDateFormat("dd.MM.yyyy");
			d1.parse(s);
			out="valid";
		}else
			out="Invalid";
		return out;
	}

}
