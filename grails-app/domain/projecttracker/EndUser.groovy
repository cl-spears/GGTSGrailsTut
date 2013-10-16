package projecttracker

class EndUser {
	String userName
	String password
	String fullName
	//drop down list order use toString
	String toString() {
		"${fullName}"
	}
	static hasMany = [projects : Project, tasks : Task]

    static constraints = {
		
		fullName()
		userName(unique: true)
		password(password: true)
    }
}
