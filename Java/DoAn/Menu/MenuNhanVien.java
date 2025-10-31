package Java.DoAn.Menu;

import java.util.Scanner;
import Java.DoAn.DS_Class.DanhSachNV;

public class MenuNhanVien {
    public void menuNhanVien() {
        DanhSachNV dsNV = new DanhSachNV();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== MENU QUAN LY NHAN VIEN =====");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Them nhan vien");
            System.out.println("4. Tim kiem nhan vien");
            System.out.println("5. Xoa nhan vien");
            System.out.println("6. Sua thong tin nhan vien");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    dsNV.nhapdsnv();
                    break;
                case 2:
                    dsNV.xuatdsnv();
                    System.out.println();
                    break;
                case 3:
                    dsNV.themdsnv();
                    break;
                case 4:
                    System.out.println("1. Tim theo ma.");
                    System.out.println("2. Tim theo ho.");
                    System.out.println("3. Tim theo ten.");
                    System.out.print("Nhap lua chon: ");
                    int subChoice = sc.nextInt();
                    sc.nextLine();
                    switch (subChoice) {
                        case 1:
                            dsNV.timNhanVien();
                            break;
                        case 2:
                            dsNV.timHoNhanVien();
                            break;
                        case 3:
                            dsNV.timTenNhanVien();
                            break;
                        default:
                            System.out.println("Lua chon khong hop le.");
                    }
                    break;
                case 5:
                    dsNV.xoaNhanVien();
                    break;
                case 6:
                    dsNV.suaNhanVien();
                    break;
                case 0:
                    System.out.println("Thoat khoi menu quan ly nhan vien.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);
    }
}
