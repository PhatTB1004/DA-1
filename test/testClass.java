package Java.DoAn.test;

import java.util.Scanner;

import Java.DoAn.DS_Class.DanhSachCTHD;
import Java.DoAn.DS_Class.DanhSachHoaDon;
import Java.DoAn.DS_Class.DanhSachPNH;
import Java.DoAn.DS_Class.DanhSachCTPNH;
import Java.DoAn.DS_Class.DanhSachNXB;
import Java.DoAn.Menu.MenuHoaDon;
import Java.DoAn.Menu.MenuNhanVien;
import Java.DoAn.Menu.MenuSach;
import Java.DoAn.Menu.MenuPhieuNhapHang;
import Java.DoAn.Menu.MenuNXB;

public class testClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        System.out.println("         --- Xin Chao ---                 ");
      

        MenuNhanVien menuNV = new MenuNhanVien();
        MenuSach menuSach = new MenuSach();
        

        System.out.println("    ========== NHA XUAT BAN ==========                  ");

        DanhSachNXB dsnxb = new DanhSachNXB();
        dsnxb.docFile("Java/DoAn/input/inputNhaXuatBan.txt");
        dsnxb.xuatDSNXB();
        MenuNXB menuNXB = new MenuNXB(dsnxb);
        
        DanhSachCTHD dscthd = new DanhSachCTHD();
        dscthd.docFile("Java/DoAn/input/inputChiTietHD.txt");


        System.out.println("     ========== HOA DON ==========                      ");
  
        DanhSachHoaDon dshd = new DanhSachHoaDon();
        dshd.docFile("Java/DoAn/input/inputHoaDon.txt");
        dshd.themHDFile();
        MenuHoaDon menuHD = new MenuHoaDon(dshd);


        DanhSachCTPNH dsctpnh = new DanhSachCTPNH();
        dsctpnh.docFile("Java/DoAn/input/inputChiTietPNH.txt");


        System.out.println("     ========== PHIEU NHAP HANG ==========              ");
     
        DanhSachPNH dspnh = new DanhSachPNH();
        dspnh.docFile("Java/DoAn/input/inputPhieuNhapHang.txt");
        dspnh.themPNHFile();
        MenuPhieuNhapHang menuPNH = new MenuPhieuNhapHang(dspnh);
        
        int choice;
        do {
            System.out.println("\n========== MENU CHINH - QUAN LY SACH ==========");
            System.out.println("1. Quan ly Nhan Vien");
            System.out.println("2. Quan ly Sach");
            System.out.println("3. Quan ly Hoa Don");
            System.out.println("4. Quan ly Phieu Nhap Hang");
            System.out.println("5. Quan ly Nha Xuat Ban");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    menuNV.MenuChinh();
                    break;
                case 2:
                    menuSach.MenuChinh();
                    break;
                case 3:
                    menuHD.MenuChinh();
                    break;
                case 4:
                    menuPNH.MenuChinh();
                    break;
                case 5:
                    menuNXB.MenuChinh();
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung chuong trinh. Hen gap lai!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);
        
        sc.close();
    }
}
