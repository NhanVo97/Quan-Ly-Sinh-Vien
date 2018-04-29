/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tongketjava1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public abstract class NhanVien {
    private String Ma;
    private String hoTen;
    private double Luong;

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }
    abstract double getThuNhap();
    Scanner sc = new Scanner(System.in);
    private  double getThueThuNhap()
    {
        double Thue=0;
        if(getThuNhap()<9000000)
        {
            System.out.println("Không đóng thuế!");
        }
        else if(getThuNhap()>9000000 && getThuNhap()<15000000)
        {
            Thue=getThuNhap()*0.1;
        }
        else if(getThuNhap()>15000000)
        {
            Thue=getThuNhap()*1.2;
        }
        return Thue;
    }
    public void Xuat()
    {
        System.out.println("Mã nhân viên:"+Ma);
        System.out.println("Họ tên:"+hoTen);
        System.out.println("Lương:"+Luong);
        System.out.println("Thu nhập:"+getThuNhap());
    }
    
}
