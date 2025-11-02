package Java.DoAn.test;

import Java.Chuong3.LienThongChinhQuy.Menu;
import Java.DoAn.DS_Class.DanhSachCTHD;
import Java.DoAn.DS_Class.DanhSachHoaDon;
import Java.DoAn.DS_Class.DanhSachNV;
import Java.DoAn.Menu.MenuNhanVien;
import Java.DoAn.Menu.MenuSach;

public class testClass {
    public static void main(String[] args) {
        MenuNhanVien menuNV = new MenuNhanVien();
        menuNV.MenuChinh();
        MenuSach menuSach = new MenuSach();
        menuSach.MenuChinh();
        DanhSachCTHD dscthd = new DanhSachCTHD();
        dscthd.docFile("Java/DoAn/Java/DoAn/input/inputChiTietHD.txt");
        DanhSachHoaDon dshd = new DanhSachHoaDon();
        dshd.themHDFile();
    }
}
