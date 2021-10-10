/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex42;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

//Create a class ParseData that parses the input file.
public class ParseData {

    public static ArrayList<EmployeeData> dataList = new ArrayList<>();

    public static void getData() throws Exception
    {
        File inputFile = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner input = new Scanner(inputFile).useDelimiter(",|\\r\\n");

        //Use delimiter "," and "\n" to scan each line of input file.

        /* Scanner should scan three lines, and then if more data exists (scanner.hasNext()),
            Store the newly created full object into the ArrayList<Object> array,
            then create a new employee object.
        */

        //This section loops until the entire file is read.
        while(input.hasNext()){
            EmployeeData newEmp = new EmployeeData(); //Create a new employee object.
            newEmp.setFirstName(input.next()); //Scan in first name from file.
            newEmp.setLastName(input.next()); //Scan in last name from file.
            newEmp.setSalary(input.nextDouble()); //Scan in salary from file.
            dataList.add(newEmp); //Store the newly created full object into the dataList array.
        }
        input.close();
    }

    public static void printList(){
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        for (EmployeeData employeeData : dataList) {
            System.out.printf("%-9s %-9s %.2f\n", employeeData.getFirstName(), employeeData.getLastName(), employeeData.getSalary());
        }

    }
    public static void main(String[] args) throws Exception {
        getData();
        printList();
    }
        /*
        Use delimiter "," and "\n" to scan each line of input file.
        Scanner should scan three lines, and then if more data exists (scanner.hasNext()),
        Store the newly created full object into the ArrayList<Object> array,
        then create a new employee object.
         */

        /*
        Create the top half of the table, a for loop that for numObjects,
         iterates through each object that was created, putting the data of one object
         on one line and then moving to the next line.
         */

}
