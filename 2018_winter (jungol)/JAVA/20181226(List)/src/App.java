import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        int year = 2000;
        if(!(year % 4 == 0 || year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)))
       
        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));

        System.out.println(pitches.remove("129"));
        System.out.println(pitches.size());
        
        System.out.println(pitches.remove(0));
        System.out.println(pitches.size());
		
	}

}
