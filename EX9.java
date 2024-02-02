public class EX9 {
    public static void main(String[] args) {
	isLeapYear(2021);
    }

    public static boolean isLeapYear(int year) {
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	{System.out.print("true");}
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}