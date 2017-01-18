//package getset;

import java.util.Scanner;

/**
 * Created by sudhamsu on 1/9/17.
 */
public class SwitchTest {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit of the month to know its name: ");
        //int month = 8;
        int month = sc.nextInt();
        String monthString;

        switch (month){
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;

        }
        System.out.println("The " +  month  + "th" + " month of the year is " + monthString);
    }


}
/*

# The switch statement in python is genrally used using dictionary
# later used in the program

month = int(raw_input("Enter the digit of the month to know its name: "))

if month == 1:
    print("The " +  str(month)  + "th" + " month of the year is " + "January")
elif month == 2:
    print("The " +  str(month)  + "th" + " month of the year is " + "February")
elif month == 3:
    print("The " +  str(month)  + "th" + " month of the year is " + "March")
elif month == 4:
    print("The " +  str(month)  + "th" + " month of the year is " + "April")
elif month == 5:
    print("The " +  str(month)  + "th" + " month of the year is " + "May")
elif month == 6:
    print("The " +  str(month)  + "th" + " month of the year is " + "June")
elif month == 7:
    print("The " +  str(month)  + "th" + " month of the year is " + "July")
elif month == 8:
    print("The " +  str(month)  + "th" + " month of the year is " + "August")
elif month == 9:
    print("The " +  str(month)  + "th" + " month of the year is " + "September")
elif month == 10:
    print("The " +  str(month)  + "th" + " month of the year is " + "October")
elif month == 11:
    print("The " +  str(month)  + "th" + " month of the year is " + "November")
elif month == 12:
    print("The " +  str(month)  + "th" + " month of the year is " + "December")
else:
    print("Invalid digit for the month")
*/