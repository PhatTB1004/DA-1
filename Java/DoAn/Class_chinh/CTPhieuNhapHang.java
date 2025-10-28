package Java.DoAn.Class_chinh;

public class CTPhieuNhapHang {
    //thuộc tính    
    String maPNH, maSach; 
    int soLuong;
    double donGia ,thanhTien;
    
    //hàm thiết lập
    public CTPhieuNhapHang(){
        maPNH = "";
        maSach ="";
        soLuong = 0;
        donGia=0.0;
        thanhTien=0.0;
    }

    public CTPhieuNhapHang(String maPNH, String maSach, int soLuong,double donGia ,double thanhTien){
        this.maPNH = maPNH;
        this.maSach = maSach;
        this.soLuong=soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public CTPhieuNhapHang(CTPhieuNhapHang ctPNH){
        this.maPNH =ctPNH.maPNH;
        this.maSach=ctPNH.maSach;
        this.soLuong =ctPNH.soLuong;
        this.donGia=ctPNH.donGia;
        this.thanhTien=ctPNH.thanhTien;
    }
    //in , out
    public void nhap(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Nhap ma Phieu Nhap Hang: ");
        maPNH = sc.nextLine();
        System.out.println("Nhap sach: ");
        maSach= sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.println("Thanh tien: ");
        thanhTien = sc.nextDouble();
    }

    public void xuat(){
        System.out.printf("%-10s %-20 %-20 %-10 %-10 %-10 %10.2f", maPNH,maSach,soLuong,donGia,thanhTien);
    }

 // Get, set:
    public String getmaPNH() {
        return maPNH;
    }
    public void setmaPNH(String maPNH) {
        this.maPNH = maPNH;
    }
    public String getmaSach() {
        return maSach;
    }
    public void setmaSach(String maSach) {
        this.maSach = maSach;
    }
    public int getsoLuong() {
        return soLuong;
    }
    public void setsoLuong(int soLuong) {
        this.soLuong = soLuong;

    }
    public Double donGia() {
        return donGia;
    }
    public void donGia(double donGia) {
        this.donGia = donGia;
    }
    public double thanhTien() {
        return thanhTien;
    }
    public void setthanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

}