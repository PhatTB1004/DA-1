package Java.DoAn.Menu;

import java.util.Scanner;

public class MenuPhieuNhapHang {
	public void menuPhieuNhapHang() {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("===== MENU QUAN LY PHIEU NHAP HANG =====");
			System.out.println("1. Nhap danh sach phieu nhap hang");
			System.out.println("2. Xuat danh sach phieu nhap hang");
			System.out.println("3. Them phieu nhap hang");
			System.out.println("4. Tim kiem phieu nhap hang");
			System.out.println("5. Xoa phieu nhap hang");
			System.out.println("6. Sua thong tin phieu nhap hang");
			System.out.println("0. Thoat");
			System.out.print("Nhap lua chon cua ban: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					System.out.println("Chuc nang: Nhap danh sach phieu nhap hang (chua duoc implement).");
					break;
				case 2:
					System.out.println("Chuc nang: Xuat danh sach phieu nhap hang (chua duoc implement).");
					break;
				case 3:
					System.out.println("Chuc nang: Them phieu nhap hang (chua duoc implement).");
					break;
				case 4:
					System.out.println("Chuc nang: Tim kiem phieu nhap hang (chua duoc implement).");
					break;
				case 5:
					System.out.print("Nhap ma phieu nhap hang can xoa: ");
					String maXoa = sc.nextLine();
					System.out.println("Da goi xoa phieu nhap hang voi ma: " + maXoa + " (chua duoc implement).");
					break;
				case 6:
					System.out.print("Nhap ma phieu nhap hang can sua: ");
					String maSua = sc.nextLine();
					System.out.println("Da goi sua phieu nhap hang voi ma: " + maSua + " (chua duoc implement).");
					break;
				case 0:
					System.out.println("Thoat khoi menu quan ly phieu nhap hang.");
					break;
				default:
					System.out.println("Lua chon khong hop le. Vui long chon lai.");
			}
		} while (choice != 0);
	}

}