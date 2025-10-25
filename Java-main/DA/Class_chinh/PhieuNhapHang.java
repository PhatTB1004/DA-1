public class PhieuNhapHang {
     //thuộc tính    
    String maPNH, maNV, maNCC; 
    int NgayLapPhieu;
    double TongTien;
    
    //hàm thiết lập
    public PhieuNhapHang(){
        maPNH = "";
        maNV ="";
        maNCC = "";
        NgayLapPhieu=0;
        TongTien=0.0;
    }

    public PhieuNhapHang(String maPNH, String maNV,String maNCC, int NgayLapPhieu,double TongTien){
        this.maPNH = maPNH;
        this.maNV = maNV;
        this.maNCC=maNCC;
        this.NgayLapPhieu = NgayLapPhieu;
        this.TongTien= TongTien;
    }

    public PhieuNhapHang(PhieuNhapHang PNH){
        this.maPNH =PNH.maPNH;
        this.maNV=PNH.maNV;
        this.maNCC =PNH.maNCC;
        this.NgayLapPhieu=PNH.NgayLapPhieu;
        this.TongTien=PNH.TongTien;
    }
    //in , out
    public void nhap(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Nhap ma Phieu Nhap Hang: ");
        maPNH = sc.nextLine();
        System.out.println("Ma Nhan Vien: ");
        maNV= sc.nextLine();
        System.out.println("Ma Nha Cung Cap: ");
        maNCC= sc.nextLine();
        System.out.println("Ngay Thanh Lap: ");
        NgayLapPhieu= sc.nextInt();
        System.out.println("Tong tien: ");
        TongTien = sc.nextDouble();
    }

    public void xuat(){
        System.out.printf("%-10s %-20s %-20s %-10d %10.2f", maPNH,maNV,maNCC,NgayLapPhieu,TongTien);
    }
    public String getmaPNH() {
        return maPNH;
    }
    public void setmaPNH(String maPNH) {
        this.maPNH = maPNH;
    }
    public String getmaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public String getmaNCC() {
        return maNCC;
    }
    public void setmaNCC(String maNCC) {
        this.maNCC = maNCC;

    }
    public int getNgayLapPhieu() {
        return NgayLapPhieu;
    }
    public void setNgayLapPhieu(int NgayLapPhieu) {
        this.NgayLapPhieu = NgayLapPhieu;
    }
    public double getTongTien() {
        return TongTien;
    }
    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    
}
