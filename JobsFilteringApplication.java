package Assignment2;

import java.io.IOException;

public class JobsFilteringApplication {

	public static void main(String[] args) throws IOException {

		JobService service = new JobService();
		service.dataSystem("jobs.txt");
		System.out.println("Finished");
	}
}