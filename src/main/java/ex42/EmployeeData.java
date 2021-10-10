/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex42;

//Create a class EmployeeInfo that stores firstname,lastname,and salary.
public class EmployeeData {
        private String firstName;
        private String lastName;
        private double salary;

        public String getFirstName(){
            return firstName;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getLastName(){
            return lastName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public double getSalary(){
            return salary;
        }
        public void setSalary(double salary){
            this.salary = salary;
        }
    }

