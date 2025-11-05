package Java.DoAn.test;

import Java.DoAn.DS_Class.DanhSachCTHD;
import Java.DoAn.DS_Class.DanhSachHoaDon;
import Java.DoAn.Menu.MenuHoaDon;
import Java.DoAn.Menu.MenuNhanVien;
import Java.DoAn.Menu.MenuSach;

public class testClass {
    public static void main(String[] args) {
        MenuNhanVien menuNV = new MenuNhanVien();
    menuNV.MenuChinh();

    MenuSach menuSach = new MenuSach();
    menuSach.MenuChinh();

    DanhSachCTHD dscthd = new DanhSachCTHD();
    dscthd.docFile("Java/DoAn/input/inputChiTietHD.txt");

    DanhSachHoaDon dshd = new DanhSachHoaDon();
    dshd.docFile("Java/DoAn/input/inputHoaDon.txt");

    MenuHoaDon menuHD = new MenuHoaDon(dshd);  // ✅ truyền danh sách có sẵn vào
    menuHD.MenuChinh();

    // khi thêm từ file, nó cập nhật vào cùng dshd
    dshd.themHDFile();
    
    menuHD.MenuChinh();
    }
}
