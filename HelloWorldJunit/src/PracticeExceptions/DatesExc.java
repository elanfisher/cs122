package PracticeExceptions;
import java.util.*;
import java.text.SimpleDateFormat;
public class DatesExc {
	
	static void convertDateFormat(String inputDate) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			Date date = sdf.parse(inputDate);
			SimpleDateFormat outSDF = new SimpleDateFormat("yyyy-MM-dd");
			String outDate = outSDF.format(date);
			System.out.println("After changing date format to yyyy/MM/dd: "+outDate);
		}
		catch(java.text.ParseException e) {
			System.out.println("Some error occured while coverting date formats.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter date in dd/MM/yyyy format: ");
		String inputDate = sc.nextLine();
		convertDateFormat(inputDate);

	}

}
