package Java.DoAn.Class_chinh;

public class Sach {
    // Thuộc tính:
    String masach, tensach, tacgia, maTL, maNXB;
    int soLuong;
    double donGia;

    // Phương thức:

    //Hàm thiết lập:
    public Sach() {
    }
    public Sach(String masach, String tensach, String tacgia, String maTL, String maNXB, int soLuong, double donGia) {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.maTL = maTL;
        this.maNXB = maNXB;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public Sach(Sach s) {
        this.masach = s.masach;
        this.tensach = s.tensach;
        this.tacgia = s.tacgia;
        this.maTL = s.maTL;
        this.maNXB = s.maNXB;
        this.soLuong = s.soLuong;
        this.donGia = s.donGia;
    }

    // Nhập, xuất:
    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        masach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tensach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacgia = sc.nextLine();
        System.out.print("Nhap ma the loai: ");
        maTL = sc.nextLine();
        System.out.print("Nhap ma nha xuat ban: ");
        maNXB = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
    }
    public void xuat() {
        System.out.printf("%-10s %-20s %-20s %-10s %-10s %-10d %-10.2f", masach, tensach, tacgia, maTL, maNXB, soLuong, donGia);
    }

    // Get, set:
    public String getMaSach() {
        return masach;
    }
    public void setMaSach(String masach) {
        this.masach = masach;
    }
    public String getTenSach() {
        return tensach;
    }
    public void setTenSach(String tensach) {
        this.tensach = tensach;
    }
    public String getTacGia() {
        return tacgia;
    }
    public void setTacGia(String tacgia) {
        this.tacgia = tacgia;
    }
    public String getMaTL() {
        return maTL;
    }
    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }
    public String getMaNXB() {
        return maNXB;
    }
    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
