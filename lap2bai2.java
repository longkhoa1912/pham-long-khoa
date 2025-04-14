/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh;

import java.util.Scanner;
public class lap2bai2 {

    public static class hinhchunhat {
        private float chieudai;
        private float chieurong;

        public void setchieudai(float chieudai){
            this.chieudai = chieudai;
        }        
        public void setchieurong(float chieurong){
            this.chieurong = chieurong;
        }        
        public float getchieudai() {
            return this.chieudai;
        }
        public float getchieurong() {
            return this.chieurong;
        }        
        public float dientich() {
            return chieudai * chieurong;
        }
        public float chuvi() {
            return 2 * (chieudai + chieurong);
        }
        @Override
        public String toString() {
            return "Hinh chu nhat:" +
                   "Chieu dai  = " + chieudai +
                   "Chieu rong = " + chieurong +
                   "Dien tich = " + dientich() +
                   "Chu vi    = " + chuvi();
        }
    }
    public static class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);           
            hinhchunhat hcn = new hinhchunhat();            
            System.out.print("Nhap chieu dai: ");
            float d = sc.nextFloat();
            hcn.setchieudai(d);            
            System.out.print("Nhap chieu rong: ");
            float r = sc.nextFloat();
            hcn.setchieurong(r);           
            System.out.println("Thong tin hinh chu nhat:");
            System.out.println(hcn);
        }
    }
}

