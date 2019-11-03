
public class Birthday {
	
	int month, day; 

	Birthday(int m, int d) throws IllegalArgumentException {
		if (m > 12 || day > 31) {
			throw new IllegalArgumentException(); 
		}
		this.month = m; 
		this.day = d; 
	}

	int getMonth() {
		return this.month;
	}

	int getDay() {
		return this.day;
	}
	
	@Override
	public String toString() {
		if (this.month == 1) {
			return "January "+day; 
		}
		else if (this.month == 2) {
			return "February "+day; 
		}
		else if (this.month == 3) {
			return "March "+day; 
		}
		else if (this.month == 4) {
			return "April "+day; 
		}
		else if (this.month == 5) {
			return "May "+day; 
		}
		else if (this.month == 6) {
			return "June "+day; 
		}
		else if (this.month == 7) {
			return "July "+day; 
		}
		else if (this.month == 8) {
			return "August "+day; 
		}
		else if (this.month == 9) {
			return "September "+day; 
		}
		else if (this.month == 10) {
			return "October "+day; 
		}
		else if (this.month == 11) {
			return "November "+day; 
		}
		else if (this.month == 12) {
			return "December "+day; 
		}
		return null; 
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (this == obj)
			return true; 
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Birthday other = (Birthday) obj; 
		return this.getMonth() == other.getMonth() && this.getDay() == other.getDay(); 
	}
	
	

}
