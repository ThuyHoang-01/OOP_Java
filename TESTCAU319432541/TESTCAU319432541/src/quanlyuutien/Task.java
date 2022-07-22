package quanlyuutien;

public class Task implements Comparable<Task> {
	//description: mô tả ; priority : ưu tiên ; complexity: phức tạp
	private String description;
	private int priority;
	private int complexity;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {

		this.priority = priority;
	}

	public int getComplexity() {
		return complexity;
	}

	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}

	public Task(String description, int priority, int complexity) {
		this.description = description;
		this.priority = priority;
		this.complexity = complexity;
	}

	public Task() {
	}

	@Override
	public String toString() {
		return "Task [description=" + description + ", priority=" + priority + ", complexity=" + complexity + "]";
	}

	@Override
	public int compareTo(Task arg0) {
		if (this.priority < arg0.priority) {
			return 1;
		} else if (this.priority > arg0.priority) {
			return -1;
		} else if (this.priority == arg0.priority) {
			if (this.complexity < arg0.complexity) {
				return 1;
			} else if (this.complexity > arg0.complexity) {
				return -1;
			}
		}
		return 0;
	}
}
