package leapyear;

public class LeapYear {
    public static void main(String[] args) {}

    public Boolean checkLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 4 == 0 && year % 100 == 0) {
            return true;
        } else {
            return true;
        }
    }
}
