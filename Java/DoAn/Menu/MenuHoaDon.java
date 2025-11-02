package Java.DoAn.Menu;

import java.util.Map;
import java.util.Scanner;

import Java.DoAn.Class_chinh.ChiTietHoaDon;
import Java.DoAn.DS_Class.DanhSachHoaDon;
import Java.DoAn.DS_Class.DanhSachNV;
import Java.DoAn.DS_Class.DanhSachSach;
import Java.DoAn.DS_Class.DanhSachCTHD;
import Java.DoAn.Class_chinh.HoaDon;

public class MenuHoaDon extends Menu {
    @Override
    public void MenuChinh() {
        MenuHoaDon menuHoaDon = new MenuHoaDon();
        DanhSachHoaDon dsHoaDon = new DanhSachHoaDon();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== MENU QUAN LY HOA DON =====");
            System.out.println("1. Xuat danh sach hoa don");
            System.out.println("2. Them hoa don");
            System.out.println("3. Tim kiem hoa don");
            System.out.println("4. Xoa hoa don");
            System.out.println("5. Sua thong tin hoa don");
            System.out.println("6. Thong le tong thu");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    dsHoaDon.xuatdshd();
                    System.out.println();
                    break;
                case 2:
                    menuHoaDon.themHoaDon();
                    break;
                case 3:
                    dsHoaDon.timHoaDon();
                    break;
                case 4:
                    System.out.println("Nhap ma hoa don can xoa: ");
                    String maXoa = sc.nextLine();
                    dsHoaDon.xoaHoaDon(maXoa);
                    break;
                case 5:
                    System.out.println("Nhap ma hoa don can sua: ");
                    String maSua = sc.nextLine();
                    dsHoaDon.suaHoaDon(maSua);
                    break;
                case 6:
                    Map<Integer,Double> tongThu = dsHoaDon.thongKeTongThu();
                    System.out.printf("Tong thu tu cac hoa don: %.2f\n", tongThu);
                    break;
                case 0:
                    System.out.println("Thoat khoi menu quan ly hoa don.");
                    break;  
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);
    }

    public void themHoaDon() {
        Scanner sc = new Scanner(System.in);
        DanhSachSach dssach = new DanhSachSach();
        DanhSachCTHD dscthd = new DanhSachCTHD();
        DanhSachHoaDon dsHoaDon = new DanhSachHoaDon();
        DanhSachNV dsnv = new DanhSachNV();
        System.out.println("Nhap ma hoa don: ");
        String mahd = sc.nextLine();
        System.out.println("Nhap ma nhan vien: ");
        String manv = sc.nextLine();
        if (dsnv.timNhanVien(manv) == null) {
            System.out.println("Ma nhan vien khong ton tai. Vui long kiem tra lai.");
            return;
        }
        System.out.println("Nhap ma khach hang: ");
        String makh = sc.nextLine();
        System.out.println("Nhap ngay lap: ");
        String ngaylap = sc.nextLine();
        Double tongtien = 0.0;
        System.out.println("Nhap so luong chi tiet hoa don: ");
        int soluongCTHD = sc.nextInt();
        for (int i = 0; i < soluongCTHD; i++) {
            System.out.print("Nhap ma sach: ");
            String masach = sc.next();
            if (dssach.timSach(masach) == null) {
                System.out.println("Ma sach khong ton tai. Vui long kiem tra lai.");
                i--;
                continue;
            }
            System.out.print("Nhap so luong: ");
            int soluong = sc.nextInt();
            System.out.print("Nhap don gia: ");
            double dongia = sc.nextDouble();
            double thanhtien = soluong * dongia;
            tongtien += thanhtien;
            ChiTietHoaDon ct = new ChiTietHoaDon(mahd, masach, soluong, dongia, thanhtien);
            dscthd.themChiTietHoaDon(ct);
            dssach.capNhatSL(masach, soluong);
        }
        HoaDon hd = new HoaDon(mahd, manv, makh, ngaylap, tongtien);
        dsHoaDon.themHoaDon(hd);
    }
}
