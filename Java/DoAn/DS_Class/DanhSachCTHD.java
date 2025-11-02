package Java.DoAn.DS_Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import Java.DoAn.Class_chinh.ChiTietHoaDon;

public class DanhSachCTHD {
    private ChiTietHoaDon[] dscthd;
    private int n;

    // KHỞI TẠO MẢNG RỖNG để tránh Arrays.copyOf(null,...)
    public DanhSachCTHD() {
        dscthd = new ChiTietHoaDon[0];
        n = 0;
    }

    //Đọc file:
    public void docFile(String filePath) {
        try (Scanner sc = new Scanner(new File(filePath))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split(",");
                if (parts.length < 5) continue;

                String mahd = parts[0].trim();
                String masach = parts[1].trim();
                int soluong = Integer.parseInt(parts[2].trim());
                double dongia = Double.parseDouble(parts[3].trim());
                double thanhtien = Double.parseDouble(parts[4].trim());

                ChiTietHoaDon cthd = new ChiTietHoaDon(mahd, masach, soluong, dongia, thanhtien);
                themChiTietHoaDon(cthd);
            }
            System.out.println("Da doc file " + filePath + " (" + n + " dong)");
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Loi doc file: " + e.getMessage());
        }
    }

    //Thêm: mở rộng mảng an toàn
    public void themChiTietHoaDon(ChiTietHoaDon cthd) {
        dscthd = Arrays.copyOf(dscthd, n + 1);
        dscthd[n] = cthd;
        n++;
    }

    //get:
    public ChiTietHoaDon getCTHD(int i) {
        if (i >= 0 && i < n) return dscthd[i];
        return null;
    }

    // Số phần tử
    public int size() {
        return n;
    }

    // In danh sách (debug)
    public void xuat() {
        for (int i = 0; i < n; i++) {
            System.out.println(dscthd[i]);
        }
    }
}