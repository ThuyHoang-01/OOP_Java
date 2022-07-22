package quanlyuutien;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriority {

	public static void main(String[] args) {
		PriorityQueue<Task> queue = new PriorityQueue<Task>();
		Task t1 = new Task("Di Hoc", 10, 5);
		Task t2 = new Task("Di Lam", 2, 6);
		Task t3 = new Task("Di Choi", 5, 4);
		Task t4 = new Task("Di An", 5, 7);
		Task t5 = new Task("Di Quay", 2, 5);

		queue.add(t1);
		queue.add(t2);
		queue.add(t3);
		queue.add(t4);
		queue.add(t5);

		System.out.println("Quản lý độ ưu tiên và độ phức tạp của công việc: ");
		System.out.println("- Nếu công việc nào có độ ưu tiên lớn hơn thì được thực hiện trước");
		System.out.println(
				"- Nếu công việc nào có cùng độ ưu tiên thì tính theo độ phức tạp, công việc nào có độ phức tạp nhiều nhất thì được thực hiện trước\r\n"
						+ "");

		Task t = queue.poll();
		System.out.println(t);
		System.out.println(queue.poll());

		// Hoa dung vong lap ben duoi de duyet cac task
		Iterator<Task> itor = queue.iterator();

		while (itor.hasNext()) {
			Task x = itor.next();
			System.out.println(x);
		}
	}

}
