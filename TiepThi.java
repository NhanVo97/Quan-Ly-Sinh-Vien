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
public class TiepThi extends NhanVien {
    private double danhSo,hueHong;

    public double getDanhSo() {
        return danhSo;
    }

    public void setDanhSo(double danhSo) {
        this.danhSo = danhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    @Override
    double getThuNhap() {
        double Luong=getLuong()+danhSo*(hueHong/100);
         return Luong;
    }
}
