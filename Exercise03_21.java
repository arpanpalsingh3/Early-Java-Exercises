import java.util.Scanner;
public class Exercise03_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2008): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		if (month==1) {
			month = 13;
			year = year -1;
		}
		if(month == 2) {
			month = 14;
			year = year - 1;
		}
			
		System.out.print("Enter the day of the month: 1-31: ");
		int dayOfMonth = input.nextInt();
		int j = year /100;
		int k = year % 100;
		
		int dayOfWeek = (dayOfMonth + 26 *(month +1)/10 + k + k/4 + j/4+ 5*j) % 7;
		if(dayOfWeek==0)
			System.out.print("Day of the week is Saturday");
		else if(dayOfWeek==1)
			System.out.print("Day of the week is Sunday");
		else if(dayOfWeek==2)
			System.out.print("Day of the week is Monday");
		else if(dayOfWeek==3)
			System.out.print("Day of the week is Tuesday");
		else if(dayOfWeek==4)
			System.out.print("Day of the week is Wednesday");
		else if(dayOfWeek==5)
			System.out.print("Day of the week is Thursday");
		else if(dayOfWeek==6)
			System.out.print("Day of the week is Friday");
		
	}

}
