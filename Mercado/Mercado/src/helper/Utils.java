package helper;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;



public class Utils {
	//conversão do formato de data mm/dd/aaaa para dd/mm/aaaa
	static SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/aaaa");
	static NumberFormat nf= new DecimalFormat("R$ #,##0.00",new DecimalFormatSymbols(new Locale("pt","BR")));
	
	
	public static String dateToString(Date data) {
		return Utils.sdf.format(data);
	}
	public static String doubleToString(double valor){
		return Utils.nf.format(valor);
		
	}
	public static Double stringTodouble(String valor) {
		//trartamentos de exceçoes com try-catch
		try {
			return(Double)Utils.nf.parse(valor);
		}catch(ParseException e) {
			return null;
		}
		
	}
	public static void pausar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
			
		}catch(InterruptedException e) {
			System.out.println("erro ao pusar por "+segundos+" segundos......");
		}
	}
}
