package week4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle extends Point {

	public double r;

	// Constructor
	public Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getDuongKinh() {
		 
		return r*2;
	}

	public double gettinhChuVi() {
		return getDuongKinh() * Math.PI;
	}

	public double gettinhDienTich() {
		return Math.pow(Math.PI, 2)*r;
	}

	@Override
	public String toString() {
		return "Ban kinh :" + r + "\tDiện tích " +new DecimalFormat("0.##").format(gettinhDienTich())
				+", Chu vi:" +new DecimalFormat("0.##").format(gettinhChuVi())+"\n"+super.toString();
	}
		
}
