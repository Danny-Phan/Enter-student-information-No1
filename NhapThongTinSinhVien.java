/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhapthongtinsinhvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhapThongTinSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //BAI TAP 1
        String name,  sex, year, hometown, major, age;
        float gpa;
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter year of birth: ");
        year = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextLine();
        System.out.println("Enter sex: ");
        sex = sc.nextLine();
        System.out.println("Enter hometown: ");
        hometown = sc.nextLine();
        System.out.println("Enter major: ");
        major = sc.nextLine();
        System.out.println("Enter GPA: ");
        gpa = sc.nextFloat();
        System.out.println("\n     Thong Tin Sinh Vien     \n");
        System.out.println("Name: "+name);
        System.out.println("Sex: "+sex);
        System.out.println("Year of birth: "+year);
        System.out.println("Age: "+age);
        System.out.println("Hometown: "+hometown);
        System.out.println("Major: "+major);
        System.out.println("GPA: "+gpa);
        
        //BAI TAP 2
        System.out.println("Enter a character: ");
        if(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println("This is a string");
        }
        else {
            System.out.println("This is not a string");
        }
        
        //BAI TAP 3
        System.out.println("Enter a charecter: ");
        if(sc.hasNext()){
            int number = sc.nextInt();
            System.out.println("You have entered an interger: "+number);
        }
        else {
            System.out.println("You haven't enter an interger");
        }
        sc.close();
    }   
}
