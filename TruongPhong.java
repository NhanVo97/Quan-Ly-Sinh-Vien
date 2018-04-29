/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tongketjava1;

/**
 *
 * @author MyPC
 */
public class TruongPhong extends NhanVien{
private double TrachNhiem;

    public double getTrachNhiem() {
        return TrachNhiem;
    }

    public void setTrachNhiem(double TrachNhiem) {
        this.TrachNhiem = TrachNhiem;
    }
    @Override
    double getThuNhap() {
       double Luong=getLuong()+TrachNhiem;
       return Luong;
    }

}
