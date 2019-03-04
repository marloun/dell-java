/**
 * 
 */

/**
 * @author Marloun_Bayari
 *
 */

import java.time.*;

public class TimesheetEntry {
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private static int NEXTID = 1;
	
	
	// Construtor
	public TimesheetEntry() {
		
	}
	public TimesheetEntry(String myProject, String myTask) {
		projectName = myProject;
		task = myTask;
		id = NEXTID;
		NEXTID++;
	}
	/**
	 * @return the projectName
	 */

	
	
	//Method
	public void updateEndTime() {
		endTime = LocalDateTime.now();
			
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the task
	 */
	public String getTask() {
		return task;
	}
	/**
	 * @param task the task to set
	 */
	public void setTask(String task) {
		this.task = task;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the startTime
	 */
	public LocalDateTime getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public LocalDateTime getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return the nEXTID
	 */
	public static int getNEXTID() {
		return NEXTID;
	}
	/**
	 * @param nEXTID the nEXTID to set
	 */
	public static void setNEXTID(int nEXTID) {
		NEXTID = nEXTID;
	}
	
	

}
