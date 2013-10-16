package projecttracker

import java.util.Date;

class Task {
	String name
	String description
	Date dueDate
	//drop down list order use toString
	String toString() {
		"${name}"
	}
	static belongsTo = [assignee : EndUser, project : Project]
	
    static constraints = {
		
		name()
		description()
		dueDate()
		
    }
}
