package Java.DoAn.DS_Class;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Java.DoAn.Class_chinh.HoaDon;

public class DanhSachHoaDon {
    private HoaDon dshd[];
    private int n;

    java.util.Scanner sc = new java.util.Scanner(System.in);

    //Hàm thiết lập:
    public DanhSachHoaDon() {
        n = 0;
    }
    public DanhSachHoaDon(HoaDon[] dshd, int n) {
        this.dshd = dshd;
        this.n = n;
    }
    public DanhSachHoaDon(DanhSachHoaDon dshd) {
        this.n = dshd.n;
        this.dshd = new HoaDon[n];
        for (int i = 0; i < n; i++) {
            this.dshd[i] = new HoaDon(dshd.dshd[i]);
        }
    }

    //Nhập, xuất:
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoa don: ");
        n = sc.nextInt();
        sc.nextLine();
        dshd = new HoaDon[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin hoa don thu " + (i + 1) + ":");
            dshd[i] = new HoaDon();
            dshd[i].nhap();
        }
    }
    public void xuat() {
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Ma HD", "Ngay Lap", "Ma KH", "Ma NV", "Tong Tien");
        for (int i = 0; i < n; i++) {
            dshd[i].xuat();
        }
    }

    //Thêm:
    public void themHoaDon() {
        n = dshd.length;
        dshd = java.util.Arrays.copyOf(dshd, n+1);
        dshd[n] = new HoaDon();
        dshd[n].nhap();
        n++;
    }
    public void themHoaDon(String mahd) {
        n = dshd.length;
        dshd = java.util.Arrays.copyOf(dshd, n+1);
        dshd[n] = new HoaDon();
        dshd[n].setMaHD(mahd);
        dshd[n].nhap();
        n++;
    }

    //Tìm
    public void timHoaDon() {
        System.out.print("Nhap ma hoa don can tim: ");
        String ma = sc.nextLine();
        timHoaDon(ma);
    }
    public HoaDon timHoaDon(String ma) {
        for (int i=0; i<n;i++) {
            if (dshd[i].getMaHD().equals(ma)) {
                dshd[i].xuat();
                return dshd[i];
            }
        }
        System.out.print("Khong tim thay hoa don co ma " + ma);
        return null;
    }

    //Sửa
    public void suaHoaDon() {
        System.out.print("Nhap ma hoa don can sua");
        String ma = sc.nextLine();
        suaHoaDon(ma);
    }
    public void suaHoaDon(String ma) {
        for (int i=0;i<n;i++) {
            if (dshd[i].getMaHD().equals(ma)) {
                System.out.println("Chon thong tin can sua:");
                System.out.println("1.Ma hoa don");
                System.out.println("2.Ma nhan vien");
                System.out.println("3.Ma khach hang");
                System.out.println("4.Ngay lap");
                System.out.println("5.Tong tien");
                System.out.println("0.Thoat");

                int choice;
                do {
                    System.out.println("Nhap lua chon");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Nhap ma hoa don moi");
                            String mahd = sc.nextLine();
                            dshd[i].setMaHD(mahd);
                            break;
                        case 2:
                            System.out.print("Nhap ma nhan vien moi");
                            String manv = sc.nextLine();
                            dshd[i].setMaNV(manv);
                            break;
                        case 3:
                            System.out.print("Nhap ma khach hang moi");
                            String makh = sc.nextLine();
                            dshd[i].setMaKH(makh);
                            break;
                        case 4:
                            System.out.print("Nhap ngay lap moi");
                            String ngaylap = sc.nextLine();
                            dshd[i].setNgayLap(ngaylap);
                            break;
                        case 5:
                            System.out.print("Nhap tong tien moi");
                            Double tongtien = sc.nextDouble();
                            dshd[i].setTongTien(tongtien);
                            break;
                    }
                } while (choice != 0);
            }
        }
    }

    //Xóa
    public void xoaHoaDon() {
        System.out.print("Nhap ma hoa don can xoa");
        String ma = sc.nextLine();
        xoaHoaDon(ma);
    }
    public void xoaHoaDon(String ma) {
        for (int i=0;i<n;i++) {
            if (dshd[i].getMaHD().equals(ma)) {
                for (int j=i;j<n-1;j++) {
                    dshd[j] =dshd[j+1];
                }
                dshd = Arrays.copyOf(dshd, n-1);
                n--;
                System.out.println("Da xoa hoa don co ma" +  ma);
                return;
            }
        }
        System.out.println("Khong tim thay hoa don co ma" + ma);
    }

    //Thống kê:
    public Map<Integer, Double> thongKeTongThu() {
        Map<Integer, Double> tongthuMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            LocalDate ngaylap = LocalDate.parse(dshd[i].getNgayLap());
            int nam = ngaylap.getYear();
            double tongtien = dshd[i].getTongTien();
            if (tongthuMap.containsKey(nam)) {
                tongthuMap.put(nam, tongthuMap.get(nam) + tongtien);
            } 
            else {
                tongthuMap.put(nam, tongtien);
            }
        }
        System.out.println("Tong thu tung nam:");
        for (Map.Entry<Integer, Double> entry : tongthuMap.entrySet()) {
            System.out.println("Nam" + entry.getKey() + " : " + entry.getValue());
        }
        return tongthuMap;
    }
}
