package DA.Class_chinh;
import java.util.Scanner;
public class TheLoai {
    //thuộc tính
    String maTheLoai, tenTheLoai;

    //hàm thiết lập
    public TheLoai() {
    }
    public TheLoai(String maTheLoai, String tenTheLoai) {
        this.maTheLoai = maTheLoai;
        this.tenTheLoai = tenTheLoai;
    }
    public TheLoai(TheLoai t) {
        this.maTheLoai = t.maTheLoai;
        this.tenTheLoai = t.tenTheLoai;
    }
    
    //nhập, xuất
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma the loai: ");
        maTheLoai = sc.nextLine();
        System.out.print("Nhap ten the loai: ");
        tenTheLoai = sc.nextLine();
    }
    public void xuat() {
        System.out.printf("%-10s %-20s%n", maTheLoai, tenTheLoai);
    }

    //get,set
    public String getMaTheLoai() {
        return maTheLoai;
    }
    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }
    public String getTenTheLoai() {
        return tenTheLoai;
    }
    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }
}
