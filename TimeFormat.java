// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		//Initializing parts of the sentence I am planning to build.
		String strMinutes, strHours, strAMPM;
		//The following code makes sure that the rules of
		// when to subtract 12 and when to add AM\PM are being followed.
		if (hours > 12) {
			strHours = "" + (hours-12);
			strAMPM =" PM";
		}
		else if (hours == 12) {
			strHours = "" + (hours);
			strAMPM = " PM";
		}
	    else {
			strHours = "" + hours;
			strAMPM =" AM";
		}
		if (minutes<10) {
			strMinutes = "0" + minutes;
		}
		else {
			strMinutes = "" + minutes;
		}
		System.out.println(strHours + ":" + strMinutes + strAMPM);

	}
}