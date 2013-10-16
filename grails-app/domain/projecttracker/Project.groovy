package projecttracker

class Project {
	
	String name
	String description
	Date dueDate
	//drop down list order use toString
	String toString() {
		"${name}"
	}
	static belongsTo = [owner : EndUser]
	static hasMany = [tasks : Task]

    static constraints = {
		
		name()
		description()
		dueDate()
    }
}
