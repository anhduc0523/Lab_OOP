package lab01;

import java.util.Scanner;

public class BacNhat2An {
	static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap a, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhap b, b = ");
        float b =scanner.nextFloat();
        System.out.print("Nhap e, e = ");
        float e = scanner.nextFloat();
        System.out.print("Nhap c, c = ");
        float c = scanner.nextFloat();
        System.out.print("Nhap d, d = ");
        float d = scanner.nextFloat();
        System.out.print("Nhap f, f = ");
        float f = scanner.nextFloat();
        giaiBacnhat2an(a, b, e, c, d, f);
    }
    
    public static void giaiBacnhat2an(float a, float b, float e, float c, float d, float f) {
    	float det = a * d - b * c;
    	if (det == 0)
    		System.out.println("He Phuong Trinh vo nghiem");
    	else {
    		float x = ((d) * (e) - (b) * (f)) / det;
            float y = ((a) * (f) - (c) * (e)) / det;
            System.out.print("x=" + x + " y=" + y);
    	}
        
    }
}
