package week4;

public class Manager extends Employee {


	
		private double assistant ;

		public void setAssistant(double assistant) {
			this.assistant = assistant;
		}
		
		public Manager(String name, String birthday, double assistant) {
			super(name, birthday);
			this.assistant = assistant;
		}



		@Override
		public String toString() {
			return "Manager [assistant=" + assistant + "]";
		}
		
		
	
}
