package Java.DoAn.test;

import Java.DoAn.Class_chinh.PhieuNhapHang;
import Java.DoAn.Class_chinh.CTPhieuNhapHang;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PhieuNhapHang phieu = null;

    public static void main(String[] args) {
        int choice;
        do {
            menu();
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    taoPhieuMoi();
                    break;
                case 2:
                    xemPhieu();
                    break;
                case 3:
                    themChiTiet();
                    break;
                case 4:
                    xoaChiTiet();
                    break;
                case 5:
                    suaChiTiet();
                    break;
                case 6:
                    timChiTiet();
                    break;
                case 7:
                    tinhLaiTongTien();
                    break;
                case 8:
                    kiemTraPhieu();
                    break;
                case 9:
                    hienThiThongTinNhanh();
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }

    // ========== MENU ==========
    public static void menu() {
        System.out.println("\n╔═══════════════════════════════════════════════╗");
        System.out.println("║     QUAN LY PHIEU NHAP HANG                   ║");
        System.out.println("╠═══════════════════════════════════════════════╣");
        System.out.println("║  1. Tao phieu nhap hang moi                   ║");
        System.out.println("║  2. Xem thong tin phieu                       ║");
        System.out.println("║  3. Them chi tiet vao phieu                   ║");
        System.out.println("║  4. Xoa chi tiet khoi phieu                   ║");
        System.out.println("║  5. Sua so luong chi tiet                     ║");
        System.out.println("║  6. Tim kiem chi tiet theo ma sach            ║");
        System.out.println("║  7. Tinh lai tong tien                        ║");
        System.out.println("║  8. Kiem tra trang thai phieu                 ║");
        System.out.println("║  9. Hien thi thong tin nhanh (toString)       ║");
        System.out.println("║  0. Thoat chuong trinh                        ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
    }

    public static void taoPhieuMoi() {
        System.out.println("\n========== TAO PHIEU NHAP HANG MOI ==========");
        phieu = new PhieuNhapHang();
        phieu.nhap();
        System.out.println("Tao phieu thanh cong!");
    }

    public static void xemPhieu() {
        if (phieu == null) {
            System.out.println("Chua co phieu nao! Vui long tao phieu truoc.");
            return;
        }
        phieu.xuat();
    }

    public static void themChiTiet() {
        if (phieu == null) {
            System.out.println("Chua co phieu nao! Vui long tao phieu truoc.");
            return;
        }

        if (phieu.isFull()) {
            System.out.println("Phieu da day, khong the them chi tiet!");
            return;
        }

        System.out.println("\n========== THEM CHI TIET MOI ==========");
        CTPhieuNhapHang ct = new CTPhieuNhapHang();
        ct.nhap();

        if (ct.isValid()) {
            ct.setmaPNH(phieu.getMaPNH()); 
            phieu.themChiTiet(ct);
            System.out.println("✅ Them chi tiet thanh cong!");
        } else {
            System.out.println("❌ Du lieu chi tiet khong hop le!");
        }
    }

    public static void xoaChiTiet() {
        if (phieu == null || phieu.isEmpty()) {
            System.out.println("❌ Phieu rong hoac chua ton tai!");
            return;
        }

        System.out.print("Nhap ma sach can xoa: ");
        String maSach = sc.nextLine();

        if (phieu.xoaChiTiet(maSach)) {
            System.out.println("✅ Xoa chi tiet thanh cong!");
        } else {
            System.out.println("❌ Khong tim thay chi tiet voi ma sach: " + maSach);
        }
    }

    public static void suaChiTiet() {
        if (phieu == null || phieu.isEmpty()) {
            System.out.println("❌ Phieu rong hoac chua ton tai!");
            return;
        }

        System.out.print("Nhap ma sach can sua: ");
        String maSach = sc.nextLine();
        
        CTPhieuNhapHang ct = phieu.timChiTiet(maSach);
        if (ct == null) {
            System.out.println("❌ Khong tim thay chi tiet voi ma sach: " + maSach);
            return;
        }

        System.out.println("Thong tin hien tai:");
        ct.xuat();
        
        System.out.print("Nhap so luong moi: ");
        int soLuongMoi = sc.nextInt();
        sc.nextLine();

        if (phieu.suaChiTiet(maSach, soLuongMoi)) {
            System.out.println("✅ Sua chi tiet thanh cong!");
            System.out.println("Thong tin sau khi sua:");
            ct.xuat();
        } else {
            System.out.println("❌ Sua chi tiet that bai!");
        }
    }

    public static void timChiTiet() {
        if (phieu == null || phieu.isEmpty()) {
            System.out.println("❌ Phieu rong hoac chua ton tai!");
            return;
        }

        System.out.print("Nhap ma sach can tim: ");
        String maSach = sc.nextLine();

        CTPhieuNhapHang ct = phieu.timChiTiet(maSach);
        if (ct != null) {
            System.out.println("\n Tim thay chi tiet:");
            System.out.printf("%-10s %-15s %-10s %12s %12s%n", 
                "MaPNH", "MaSach", "SoLuong", "DonGia", "ThanhTien");
            System.out.println("-------------------------------------------------------------");
            ct.xuat();
        } else {
            System.out.println(" Khong tim thay chi tiet voi ma sach: " + maSach);
        }
    }

    public static void tinhLaiTongTien() {
        if (phieu == null) {
            System.out.println(" Chua co phieu nao!");
            return;
        }

        double tongCu = phieu.getTongTien();
        phieu.tinhLaiTongTien();
        double tongMoi = phieu.getTongTien();

        System.out.println("\n========== TINH LAI TONG TIEN ==========");
        System.out.printf("Tong tien cu:  %,15.2f VND%n", tongCu);
        System.out.printf("Tong tien moi: %,15.2f VND%n", tongMoi);
        
        if (tongCu == tongMoi) {
            System.out.println(" Tong tien van dung!");
        } else {
            System.out.println(" Tong tien da duoc cap nhat!");
        }
    }

    public static void kiemTraPhieu() {
        if (phieu == null) {
            System.out.println(" Chua co phieu nao!");
            return;
        }

        System.out.println("\n========== TRANG THAI PHIEU ==========");
        System.out.println("Ma phieu: " + phieu.getMaPNH());
        System.out.println("So luong chi tiet: " + phieu.getSoLuongCT());
        System.out.println("Tong tien: " + String.format("%,.2f", phieu.getTongTien()) + " VND");
        System.out.println("Phieu rong: " + (phieu.isEmpty() ? "Co" : "Khong"));
        System.out.println("Phieu day: " + (phieu.isFull() ? "Co" : "Khong"));

        System.out.println("\nKiem tra chi tiet:");
        for (int i = 0; i < phieu.getSoLuongCT(); i++) {
            CTPhieuNhapHang ct = phieu.layChiTiet(i);
            System.out.printf("  Chi tiet %d: %s - %s%n", 
                i + 1, 
                ct.getmaSach(), 
                ct.isValid() ? " Hop le" : " Khong hop le");
        }
    }

    public static void hienThiThongTinNhanh() {
        if (phieu == null) {
            System.out.println(" Chua co phieu nao!");
            return;
        }

        System.out.println("\n========== THONG TIN NHANH ==========");
        System.out.println("Phieu: " + phieu.toString());
        
        System.out.println("\nCac chi tiet:");
        for (int i = 0; i < phieu.getSoLuongCT(); i++) {
            CTPhieuNhapHang ct = phieu.layChiTiet(i);
            System.out.println("  " + (i + 1) + ". " + ct.toString());
        }
    }
}