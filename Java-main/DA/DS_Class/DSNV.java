package Java.DoAn.DS_Class;

import java.util.Arrays;
import java.util.Scanner;

import Java.DoAn.Class_chinh.NhanVien;

public class DSNV {
    // Thuộc tính:
    NhanVien[] dsnv;
    int n;

    // Phương thức:

    // Hàm thiết lập:
    public DSNV() {
        dsnv = new NhanVien[100];
        n = 0;
    }
    public DSNV(NhanVien[] dsnv, int n) {
        this.dsnv = dsnv;
        this.n = n;
    }
    public DSNV(DSNV ds) {
        this.n = ds.n;
        this.dsnv = new NhanVien[100];
        for (int i = 0; i < n; i++) {
            this.dsnv[i] = new NhanVien(ds.dsnv[i]);
        }
    }

    // Nhập, xuất:
    public void nhapdsnv() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            dsnv[i] = new NhanVien();
            dsnv[i].nhap();
        }
    }
    public void xuatdsnv() {
        System.out.printf("%-10s %-15s %-10s %-15s %-15s %-10s %-10s\n", "Ma NV", "Ho", "Ten", "SDT", "Ngay Sinh", "Gioi Tinh", "Luong");
        for (int i = 0; i < n; i++) {
            dsnv[i].xuat();
        }
    }

    // them
    public void themdsnv() {
        n = dsnv.length;
        dsnv = Arrays.copyOf(dsnv, n+1);
        dsnv[n] = new NhanVien();
        dsnv[n].nhap();
        n++;
    }
    public void themdsnv(String manv) {
        n = dsnv.length;
        dsnv = Arrays.copyOf(dsnv, n+1);
        dsnv[n] = new NhanVien();
        n++;
    }

    // tim:
    public void timnv() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim: ");
        String ma = sc.nextLine();
        timnv(ma);
    }
    public NhanVien timnv(String ma) {
        for (int i = 0; i < n; i++) {
            if (dsnv[i].getMaNV().equals(ma)) {
                dsnv[i].xuat();
                return dsnv[i];
            }
        }
        System.out.println("Khong tim thay nhan vien co ma " + ma);
        return null;
    }

    public void tim_honv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho nhan vien can tim: ");
        String ho = sc.next();
        tim_honv(ho);
    }
    public NhanVien[] tim_honv(String ho) {
        NhanVien[] timho = new NhanVien[0];
        int m=0;
        for (int i = 0; i < n; i++) {
            if (dsnv[i].getHo().contains(ho)) {
                timho = Arrays.copyOf(timho, m + 1);
                timho[m] = new NhanVien(dsnv[i]);
                m++;
            }
        }
        if (m > 0) {
            System.out.println("Cac nhan vien co ho " + ho + ":");
            for (int i = 0; i < m; i++) {
                timho[i].xuat();
            }
            return timho;
        }
        else System.out.println("Khong tim thay nhan vien nao co ho " + ho);
        return null;
    }
    public NhanVien[] tim_tennv(String ten) {
        NhanVien[] timten = new NhanVien[0];
        int m=0;
        for (int i = 0; i < n; i++) {
            if (dsnv[i].getTen().contains(ten)) {
                timten = Arrays.copyOf(timten, m + 1);
                timten[m] = new NhanVien(dsnv[i]);
                m++;
            }
        }
        if (m > 0) {
            System.out.println("Cac nhan vien co ten " + ten + ":");
            for (int i = 0; i < m; i++) {
                timten[i].xuat();
            }
            return timten;
        }
        else System.out.println("Khong tim thay nhan vien nao co ten " + ten);
        return null;
    }

    // xoa:
    public void xoanv() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ma nhan vien can xoa: ");
        String ma = sc.nextLine();
        xoanv(ma);
    }
    public void xoanv(String ma) {
        for (int i = 0; i < n; i++) {
            if (dsnv[i].getMaNV().equals(ma)) {
                for (int j = i; j < n - 1; j++) {
                    dsnv[j] = dsnv[j + 1];
                }
                dsnv[n - 1] = null;
                n--;
                System.out.println("Da xoa nhan vien co ma " + ma);
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien co ma " + ma);
    }

    // sua:
    public void suanv() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ma nhan vien can sua: ");
        String ma = sc.nextLine();
        suanv(ma);
    }
    public void suanv(String manv) {
        for (int i = 0; i < n; i++) {
            if (dsnv[i].getMaNV().equals(manv)) {               
                System.out.println("Chon thong tin can sua:");
                System.out.println("1. Ho");
                System.out.println("2. Ten");
                System.out.println("3. SDT");
                System.out.println("4. Ngay sinh");
                System.out.println("5. Gioi tinh");
                System.out.println("6. Luong");
                System.out.println("0. Thoat");
                System.out.print("Nhap lua chon: ");
                int choice = new java.util.Scanner(System.in).nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Nhap ho moi: ");
                        String ho = new java.util.Scanner(System.in).nextLine();
                        dsnv[i].setHo(ho);
                        break;
                    case 2:
                        System.out.print("Nhap ten moi: ");
                        String ten = new java.util.Scanner(System.in).nextLine();
                        dsnv[i].setTen(ten);
                        break;
                    case 3:
                        System.out.print("Nhap SDT moi: ");
                        String sdt = new java.util.Scanner(System.in).nextLine();
                        dsnv[i].setSDT(sdt);
                        break;
                    case 4:
                        System.out.print("Nhap ngay sinh moi: ");
                        String ngaysinh = new java.util.Scanner(System.in).nextLine();
                        dsnv[i].setNgaySinh(ngaysinh);
                        break;
                    case 5:
                        System.out.print("Nhap gioi tinh moi: ");
                        String gioitinh = new java.util.Scanner(System.in).nextLine();
                        dsnv[i].setGioiTinh(gioitinh);
                        break;
                    case 6:
                        System.out.print("Nhap luong moi: ");
                        double luong = new java.util.Scanner(System.in).nextDouble();
                        dsnv[i].setLuong(luong);
                        break;
                } while (choice != 0);
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien co ma " + manv);
    }

}
