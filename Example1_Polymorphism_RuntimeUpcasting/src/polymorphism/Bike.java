package polymorphism;

public class Bike {
/*Ví dụ 1: chúng ta tạo hai lớp Bike và Splendar. Lớp Splendar kế thừa lớp Bike và ghi 
	đè phương thức run() của nó. Chúng ta gọi phương thức run bởi biến tham chiếu của lớp 
	cha. Khi nó tham chiếu tới đối tượng của lớp con và phương thức lớp con ghi đè phương thức 
	của lớp cha, phương thức lớp con được triệu hồi tại runtime. Khi việc gọi phương thức được 
	quyết định bởi JVM chứ không phải Compiler, vì thế đó là đa hình tại runtime.
*/	
	public void run() {
		System.out.println("running");
	}
}



