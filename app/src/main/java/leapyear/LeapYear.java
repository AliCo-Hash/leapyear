package leapyear;

public class LeapYear {
    public static void main(String[] args) {}

    public Boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
