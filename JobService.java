package Assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JobService {
	// declaring class variables
	String[] aPolished;
	POJO oJob;
	POJO[] aJobs = new POJO[90];
	String sData;
	int i = 0;

	/*
	 * reading sFilename(given in by JobsFilteringApplication) calling dataCleaner
	 * afterwards, passing in sData (sData = String from one Line inside the file)
	 * after executing this.dataCleaner increment i by 1
	 */
	public String dataSystem(String sFilename) throws IOException {

		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(sFilename));
		this.sData = reader.readLine();
		while ((this.sData = reader.readLine()) != null) {
			System.out.println(sData);
			this.dataCleaner(sData);
			this.i++;
		}
		// after sData = null print out empty line for better visible seperation
		// then print out Jobs[] and close BufferedReader reader.
		System.out.println();
		this.printData(aJobs);
		reader.close();
		return sData;

	}

	/*
	 * stores oJob passed on from createJob into Jobs[] on index i wich gets
	 * incremented after a line of text is read and processed
	 */
	public POJO[] createJobsArray(POJO oJob) {

		this.aJobs[i] = oJob;
		return aJobs;
	}

	/*
	 * Replacing "," with " afterwards split String by " then call createJob,
	 * passing in the Array that results from .split
	 */
	public String[] dataCleaner(String sData) throws IOException {

		String sReplace = sData.replaceAll("\",\"", "\"");
		this.aPolished = sReplace.split("\"");
		this.createJob(aPolished);
		return aPolished;
	}

	/*
	 * Replacing empty line on index[0] by moving all values of the Array on value
	 * down setting Title, company and compensation calling createJobsApplication if
	 * input.length is smaller then 4 (wich results if data is missing in the file)
	 * set oJob to null
	 */
	public POJO createJob(String[] input) {

		this.oJob = new POJO();
		if (input.length == 4) {
			input[0] = input[1];
			input[1] = input[2];
			input[2] = input[3];
			oJob.setTitle(input[0]);
			oJob.setCompany(input[1]);
			oJob.setCompensation(input[2]);
			this.createJobsArray(oJob);
		} else {
			oJob = null;
		}
		return oJob;
	}

	/*
	 * checking for objects oJob in input as long as oJob is not null print out
	 * getJobInfo else don't print anything
	 */
	public void printData(POJO[] input) {

		for (POJO oJob : input) {
			if (oJob != null) {
				System.out.println(oJob.getJobInfo());
			} else {
			}
		}
	}
}
