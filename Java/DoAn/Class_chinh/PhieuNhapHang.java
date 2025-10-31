package Java.DoAn.Class_chinh;

import java.util.Scanner;

public class PhieuNhapHang {
    String maPNH;
    String maNV;
    String maNCC;
    String ngayLapPhieu;
    double tongTien;
    CTPhieuNhapHang[] chiTiets;
    int soLuongCT;

    public PhieuNhapHang() {
        this.maPNH = "";
        this.maNV = "";
        this.maNCC = "";
        this.ngayLapPhieu = "";
        this.tongTien = 0.0;
        this.chiTiets = new CTPhieuNhapHang[100];
        this.soLuongCT = 0;
    }

    public PhieuNhapHang(String maPNH, String maNV, String maNCC, String ngayLapPhieu) {
        this();
        this.maPNH = maPNH;
        this.maNV = maNV;
        this.maNCC = maNCC;
        this.ngayLapPhieu = ngayLapPhieu;
    }

    public PhieuNhapHang(PhieuNhapHang PNH) {
        this.maPNH = PNH.maPNH;
        this.maNV = PNH.maNV;
        this.maNCC = PNH.maNCC;
        this.ngayLapPhieu = PNH.ngayLapPhieu;
        this.tongTien = PNH.tongTien;
        this.chiTiets = new CTPhieuNhapHang[100];
        this.soLuongCT = PNH.soLuongCT;
        for (int i = 0; i < soLuongCT; i++) {
            this.chiTiets[i] = new CTPhieuNhapHang(PNH.chiTiets[i]);
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma Phieu Nhap Hang: ");
        maPNH = sc.nextLine();
        System.out.print("Ma Nhan Vien: ");
        maNV = sc.nextLine();
        System.out.print("Ma Nha Cung Cap: ");
        maNCC = sc.nextLine();
        System.out.print("Ngay Thanh Lap (so): ");
        ngayLapPhieu = sc.nextLine();
        sc.nextLine();

        System.out.print("Nhap so luong chi tiet trong phieu: ");
        int k = sc.nextInt();
        sc.nextLine();
        tongTien = 0.0;
        soLuongCT = 0;
        for (int i = 0; i < k; i++) {
            System.out.println("Nhap chi tiet thu " + (i + 1) + ":");
            CTPhieuNhapHang ct = new CTPhieuNhapHang();
            ct.nhap();
            themChiTiet(ct);
        }
    }

    public void xuat() {
        System.out.println("\n========== THONG TIN PHIEU NHAP HANG ==========");
        System.out.printf("%-15s %-15s %-15s %-10s%n", "MaPNH", "MaNV", "MaNCC", "NgayLap");
        System.out.printf("%-15s %-15s %-15s %-10s%n", maPNH, maNV, maNCC, ngayLapPhieu);
        
        System.out.println("\n========== CHI TIET PHIEU NHAP HANG ==========");
        System.out.printf("%-10s %-15s %-10s %12s %12s%n", 
            "MaPNH", "MaSach", "SoLuong", "DonGia", "ThanhTien");
        System.out.println("-------------------------------------------------------------");
        
        // In từng chi tiết
        for (int i = 0; i < soLuongCT; i++) {
            chiTiets[i].xuat();
        }
        
        System.out.println("=============================================================");
        System.out.printf("TONG TIEN CUA PHIEU: %,15.2f VND%n", tongTien);
        System.out.println("=============================================================");
    
    }

    public void themChiTiet(CTPhieuNhapHang ct) {
        if (soLuongCT < chiTiets.length) {
            chiTiets[soLuongCT++] = ct;
            tongTien += ct.thanhTien();
        } else {
            System.out.println("Danh sach chi tiet da day, khong the them.");
        }
    }

    
    public boolean xoaChiTiet(String maSach) {
        for (int i = 0; i < soLuongCT; i++) {
            if (chiTiets[i].maSach.equals(maSach)) {
                tongTien -= chiTiets[i].thanhTien;
                for (int j = i; j < soLuongCT - 1; j++) {
                    chiTiets[j] = chiTiets[j + 1];
                }
                chiTiets[--soLuongCT] = null;
                return true;
            }
        }
        return false;
    }

    public boolean suaChiTiet(String maSach, int soLuongMoi) {
        CTPhieuNhapHang ct = timChiTiet(maSach);
        if (ct != null) {
            tongTien -= ct.thanhTien;
            ct.setsoLuong(soLuongMoi);
            tongTien += ct.thanhTien;
            return true;
        }
        return false;
    }

    public CTPhieuNhapHang timChiTiet(String maSach) {
        for (int i = 0; i < soLuongCT; i++) {
            if (chiTiets[i].maSach.equals(maSach)) {
                return chiTiets[i];
            }
        }
        return null;
    }

    public CTPhieuNhapHang layChiTiet(int index) {
        if (index >= 0 && index < soLuongCT) {
            return chiTiets[index];
        }
        return null;
    }

    public void tinhLaiTongTien() {
        tongTien = 0.0;
        for (int i = 0; i < soLuongCT; i++) {
            tongTien += chiTiets[i].thanhTien;
        }
    }

    public boolean isEmpty() {
        return soLuongCT == 0;
    }

    public boolean isFull() {
        return soLuongCT >= chiTiets.length;
    }

    @Override
    public String toString() {
        return String.format("PhieuNhapHang[maPNH=%s, maNV=%s, maNCC=%s, ngayLap=%s, soLuongCT=%d, tongTien=%.2f]",
            maPNH, maNV, maNCC, ngayLapPhieu, soLuongCT, tongTien);
    }

    public String getMaPNH() {
        return maPNH;
    }

    public void setMaPNH(String maPNH) {
        this.maPNH = maPNH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getNgayLapPhieu() {
        return ngayLapPhieu;
    }

    public void setNgayLapPhieu(String ngayLapPhieu) {
        this.ngayLapPhieu = ngayLapPhieu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getSoLuongCT() {
        return soLuongCT;
    }

    public CTPhieuNhapHang[] getChiTiets() {
        return chiTiets;
    }

}
