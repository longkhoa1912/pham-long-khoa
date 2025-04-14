/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;

import java.util.Scanner;
public class sotancung {
int n;
       Scanner Tim=new Scanner(System.in);
       System.out.print("nhap so n: "); 
       n=Tim.nextInt();
       int sodau= n;
       while(sodau>=10){
       sodau=n/10;
     }
       int socuoi=n%10; 
        System.out.println("so dau: "+sodau);
        System.out.println("so cuoi: "+socuoi);
     }
}

