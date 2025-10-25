package Java.DoAn.DS_Class;

import Java.DoAn.Class_chinh.Sach;
import Java.DoAn.Class_chinh.SachNuocNgoai;
import Java.DoAn.Class_chinh.TapChi;

public class DSSach {
    Sach[] ds;
    int n;

    //Hàm thiết lập:
    public DSSach() {
        ds = new Sach[100];
        n = 0;
    }
    public DSSach(Sach[] ds, int n) {
        this.ds = ds;
        this.n = n;
    }
    public DSSach(DSSach s) {
        this.ds = s.ds;
        this.n = s.n;
    }

    //Nhập, xuất:
    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap so luong sach: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            System.out.println("Nhap sach binh thuong (1) hay sach nuoc ngoai (2) hay tap chi (3): ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                ds[i] = new Sach();
                ds[i].nhap();
            } else if (choice == 2) {
                ds[i] = new SachNuocNgoai();
                ds[i].nhap();
            } else if (choice == 3) {
                ds[i] = new TapChi();
                ds[i].nhap();
            } else {
                System.out.println("Lua chon khong hop le. Mac dinh nhap sach binh thuong.");
                ds[i] = new Sach();
            }
            ds[i].nhap();
        }
    }
    public void xuat() {
        for (int i = 0; i < n; i++) {
            ds[i].xuat();
            System.out.println();
        }
    }
}
