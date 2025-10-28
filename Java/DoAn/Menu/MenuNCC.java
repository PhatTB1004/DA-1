package Java.DoAn.Menu;

import java.util.Scanner;
import Java.DoAn.DS_Class.DSNCC;

public class MenuNCC {
    public void menuNCC() {
        DSNCC dsNCC = new DSNCC();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== MENU QUAN LY NHA CUNG CAP =====");
            System.out.println("1. Nhap danh sach nha cung cap");
            System.out.println("2. Xuat danh sach nha cung cap");
            System.out.println("3. Them nha cung cap");
            System.out.println("4. Tim kiem nha cung cap");
            System.out.println("5. Xoa nha cung cap");
            System.out.println("6. Sua thong tin nha cung cap");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    dsNCC.nhapDSNCC();
                    break;
                case 2:
                    dsNCC.xuatDSNCC();
                    System.out.println();
                    break;
                case 3:
                    dsNCC.themNCC();
                    break;
                case 4:
                    dsNCC.timNCC();
                    break;
                case 5:
                    System.out.println("Nhap ma nha cung cap can xoa: ");
                    String maXoa = sc.nextLine();
                    dsNCC.xoaNCC(maXoa);
                    break;
                case 6:
                    System.out.println("Nhap ma nha cung cap can sua: ");
                    String maSua = sc.nextLine();
                    dsNCC.suaNCC(maSua);
                    break;
                case 0:
                    System.out.println("Thoat khoi menu quan ly nha cung cap.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);
    }

}
