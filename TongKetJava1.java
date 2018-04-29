/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tongketjava1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class TongKetJava1 {

  final int hanhChinh=1;
  final int truongPhong=2;
  final int tiepThi=3;
  int c;
  public static TongKetJava1 tk = new TongKetJava1();
  static Scanner sc = new Scanner(System.in);
  public boolean CheckNV(ArrayList<NhanVien> nv,String ma)
   {
       for(int i=0;i<nv.size();i++)
       {
           if(nv.get(i).getMa().equalsIgnoreCase(ma))
           {
               c=i;
               return true;
           }
          
       }
       return false;
   }
    public void Nhap(ArrayList<NhanVien> list)
    {
        int k;
         String ten,ma;
        double luong;
        System.out.println("__________MENU NHẬP__________");
        System.out.println("1. Nhập nhân viên hành chính");
        System.out.println("2. Nhập nhân viên trưởng phòng");
        System.out.println("3. Nhập nhân viên tiếp thị");
        System.out.println("4. Kết thúc");
        System.out.print("Lựa chọn:");
        k=sc.nextInt();
        sc.nextLine();
        switch(k)
        {
            case hanhChinh:
            {
               while(true)
               {
                   NhanVien nv = new TiepThi();
                    String cHanhChinh="[HC]{2}+[\\d]{3}";
       
                    do
                    {
                    System.out.println("Nhập mã nhân viên:");
                    ma=sc.nextLine();
                     if(!ma.matches(cHanhChinh) || tk.CheckNV(list, ma))
                    {
                        System.out.println("Mã Nhân Viên trưởng phòng phải đầu bằng hai kí tự HC sau đó là 3 chữ số và đồng thời không tồn tại trong hệ thống!");
                    }
                    else
                    {
                        nv.setMa(ma);
                    }
                    }
                    while(!ma.matches(cHanhChinh) ||tk.CheckNV(list, ma) );
                    System.out.println("Nhập họ tên:");
                    ten=sc.nextLine();
                    nv.setHoTen(ten);

                    System.out.println("Nhập lương:");
                    luong=sc.nextDouble();
                     sc.nextLine();
                    nv.setLuong(luong);
                    list.add(nv);
                    System.out.println("Bạn có muốn nhập tiếp không?(Y/N)");
                    if( sc.nextLine().equalsIgnoreCase("N"))
                    {
                        break;
                    }

                 }
               break;
        } 
            case tiepThi:
            {
                while(true)
               {
                   TiepThi nv = new TiepThi();
                    String cTiepThi="[TT]{2}+[\\d]{3}";
       
                    do
                    {
                    System.out.println("Nhập mã nhân viên:");
                    ma=sc.nextLine();
                     if(!ma.matches(cTiepThi) || tk.CheckNV(list, ma))
                    {
                        System.out.println("Mã Nhân Viên trưởng phòng phải đầu bằng hai kí tự TT sau đó là 3 chữ số và đồng thời không tồn tại trong hệ thống!");
                    }
                    else
                    {
                        nv.setMa(ma);
                    }
                    }
                    while(!ma.matches(cTiepThi) ||tk.CheckNV(list, ma) );
                    System.out.println("Nhập họ tên:");
                    ten=sc.nextLine();
                    nv.setHoTen(ten);

                    System.out.println("Nhập lương:");
                    luong=sc.nextDouble();
                     sc.nextLine();
                    nv.setLuong(luong);
                    list.add(nv);
                    System.out.println("Bạn có muốn nhập tiếp không?(Y/N)");
                    if( sc.nextLine().equalsIgnoreCase("N"))
                    {
                        break;
                    }

                 }
               break;
        }
            case truongPhong:
            {
                while(true)
               {
                   TiepThi nv = new TiepThi();
                    String cTiepThi="[TP]{2}+[\\d]{3}";
       
                    do
                    {
                    System.out.println("Nhập mã nhân viên:");
                    ma=sc.nextLine();
                     if(!ma.matches(cTiepThi) || tk.CheckNV(list, ma))
                    {
                        System.out.println("Mã Nhân Viên trưởng phòng phải đầu bằng hai kí tự TP sau đó là 3 chữ số và đồng thời không tồn tại trong hệ thống!");
                    }
                    else
                    {
                        nv.setMa(ma);
                    }
                    }
                    while(!ma.matches(cTiepThi) ||tk.CheckNV(list, ma) );
                    System.out.println("Nhập họ tên:");
                    ten=sc.nextLine();
                    nv.setHoTen(ten);

                    System.out.println("Nhập lương:");
                    luong=sc.nextDouble();
                     sc.nextLine();
                    nv.setLuong(luong);
                    list.add(nv);
                    System.out.println("Bạn có muốn nhập tiếp không?(Y/N)");
                    if( sc.nextLine().equalsIgnoreCase("N"))
                    {
                        break;
                    }

                 }
                break;
            }
            case 4:
                break;
                
        }
    }
    public void Xuat( ArrayList<NhanVien> list)
    {
        for(int i=0;i<list.size();i++)
        {
            list.get(i).Xuat();
        }
    }
    public void Find(ArrayList<NhanVien> list)
    {
        System.out.println("Nhập mã nhân viên cần tìm:");
        String x= sc.nextLine();
      
      if(tk.CheckNV(list, x))
      {
         list.get(c).Xuat();
      }
      else
      {
          System.out.println("Không tìm thấy!");
      }
    }
    public void Xoa(ArrayList<NhanVien> list)
    {
        System.out.println("Nhập mã nhân viên cần xóa:");
        String x= sc.nextLine();
        if(tk.CheckNV(list, x))
      {
         list.remove(c);
          System.out.println("Đã xóa");
      }
      else
      {
          System.out.println("Không tìm thấy!");
      }
    }
    public void CapNhat(ArrayList<NhanVien> list)
    {
         String ten,ma;
        double luong;
         System.out.println("Nhập mã nhân viên cần cập nhật:");
        String x= sc.nextLine();
        if(tk.CheckNV(list, x))
      {
          System.out.println("Nhập mã mới:");
          ma=sc.nextLine();
          list.get(c).setMa(ma);
          System.out.println("Nhập tên mới:");
          ten=sc.nextLine();
          list.get(c).setHoTen(ten);
          System.out.println("Nhập lương:");
          luong=sc.nextDouble();
          list.get(c).setLuong(luong);
          System.out.println("Đã cập nhật thành công!");
      }
      else
      {
          System.out.println("Không tìm thấy!");
      }
    }
    public void timNV(ArrayList<NhanVien> list)
    {
        double min,max;
        System.out.println("Nhập min lương:");
        min=sc.nextDouble();
        System.out.println("Nhập max lương:");
        max=sc.nextDouble();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getLuong()>min && list.get(i).getLuong()<max)
            {
                list.get(i).Xuat();
            }
        }
    }
    public void SapxepName(ArrayList<NhanVien> list)
    {
        Collections.sort(list,new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien t, NhanVien t1) {
              return  t.getHoTen().compareToIgnoreCase(t1.getHoTen());
            }
        });
        
    }
    public void SapXepThuNhap(ArrayList<NhanVien> list)
    {
       Collections.sort(list,new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien t, NhanVien t1) {
              return  (int) (t.getThuNhap()-t1.getThuNhap());
            }
        });
    }
    public void XuatMaxThuNhap(ArrayList<NhanVien> list)
    {
         double tong=0;
        for(int i=0;i<list.size();i++)  
        {
            tong=tong+list.get(i).getThuNhap();
        }
        double tb=tong/list.size();
        for(int j=0;j<list.size();j++)
        {
            if(list.get(j).getThuNhap()>tb)
            {
                list.get(j).Xuat();
            }
        }
    }
    public static void main(String[] args) {
        int k;
        ArrayList<NhanVien> list = new ArrayList<>();
        
        while(true)
        {
            System.out.println("__________MENU__________");
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Tìm hiển thị nhân viên theo mã ");
            System.out.println("4. Xóa nhân viên theo mã");
            System.out.println("5. Cập nhật nhân viên theo mã");
            System.out.println("6. Tìm nhân viên theo khoảng lương ");
            System.out.println("7. Sắp xếp theo họ và tên");
            System.out.println("8. Sắp xếp theo thu nhập");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("10. Kết thúc");
            System.out.println("Nhập lựa chọn:");
            k=sc.nextInt();
            sc.nextLine();
            switch(k)
            {
                case 1:
                {
                    tk.Nhap(list);
                    break;
                }
                case 2:
                {
                    tk.Xuat(list);
                    break;
                }
                case 3:
                {
                    tk.Find(list);
                    break;
                }
                case 4:
                {
                    tk.Xoa(list);
                    break;
                }
                case 5:
                {
                    tk.CapNhat(list);
                    break;
                }
                case 6:
                {
                    tk.timNV(list);
                    break;
                }
                case 7:
                {
                    tk.SapxepName(list);
                    tk.Xuat(list);
                    break;
                }
                case 8:
                {
                    tk.SapXepThuNhap(list);
                    tk.Xuat(list);
                    break;
                }
                case 9:
                {
                    tk.XuatMaxThuNhap(list);
                    break;
                }
                case 10:
                {
                    break;
                }
            }
            
            
        }
      
        
    }
    
}
