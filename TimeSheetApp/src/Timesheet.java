import java.util.List;
import java.util.ArrayList;


public class Timesheet {
	private List<TimesheetEntry> database;
	
	// Constructor
	public Timesheet() {
		database = new ArrayList<>();		
	}

	public List<TimesheetEntry> getDatabase() {
		return database;
	}


	public void setDatabase(List<TimesheetEntry> database) {
		this.database = database;
	}
	
	
	//Methods
	public void add(String project, String task) {
		
		TimesheetEntry insert = new TimesheetEntry(project, task);
		database.add(insert);	
	}
	
	
}
