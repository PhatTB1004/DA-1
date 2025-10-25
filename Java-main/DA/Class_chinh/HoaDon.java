package Java.DoAn.Class_chinh;

public class HoaDon {
    // Thuộc tính:
    String maHD, maNV, maKH, ngaylap;
    double tongtien;

    // Phương thức:

    //Hàm thiết lập:
    public HoaDon() {
    }
    public HoaDon(String maHD, String maNV, String maKH, String ngaylap, double tongtien) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ngaylap = ngaylap;
        this.tongtien = tongtien;
    }
    public HoaDon(HoaDon h) {
        this.maHD = h.maHD;
        this.maNV = h.maNV;
        this.maKH = h.maKH;
        this.ngaylap = h.ngaylap;
        this.tongtien = h.tongtien;
    }

    // Nhập, xuất:
    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ma hoa don: ");
        maHD = sc.nextLine();
        System.out.print("Nhap ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("Nhap ma khach hang: ");
        maKH = sc.nextLine();
        System.out.print("Nhap ngay lap: ");
        ngaylap = sc.nextLine();
        System.out.print("Nhap tong tien: ");
        tongtien = sc.nextDouble();
    }
    public void xuat() {
        System.out.printf("%-10s %-10s %-10s %-15s %-10.2f\n", maHD, maNV, maKH, ngaylap, tongtien);
    }

    // Get, set:
    public String getMaHD() {
        return maHD;
    }
    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }
    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public String getMaKH() {
        return maKH;
    }
    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    public String getNgayLap() {
        return ngaylap;
    }
    public void setNgayLap(String ngaylap) {
        this.ngaylap = ngaylap;
    }
    public double getTongTien() {
        return tongtien;
    }
    public void setTongTien(double tongtien) {
        this.tongtien = tongtien;
    }
}
