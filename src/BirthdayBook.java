
public class BirthdayBook {
	
	Entry[] entries;
	int noe; 
	
	BirthdayBook(){
		this.entries = new Entry[10]; 
	}
	

	int getNumberOfEntries() {
		return this.noe; 
	}

	Entry[] getEntries() {
		Entry[] e = new Entry[noe]; 
		
		for (int i = 0; i < noe; i++) {
			e[i] = entries[i]; 
		}
		return e; 
	}
	
	@Override
	public String toString() {
		String s; 
		s = "There are "+noe+" entries in the book\n";
		for (int i = 0; i < noe; i++) {
			s += entries[i].toString()+"\n"; 
		}
		return s; 
	}




	boolean nameExists(String string) {
		for (int i = 0; i < noe; i++) {
			if (entries[i].getName().equals(string)) {
				return true; 
			}
		}
		return false; 
	}




	Birthday getBirthday(String string) {
		if (this.nameExists(string)){
			for (int i = 0; i < noe; i++) {
				if (entries[i].getName().equals(string)) {
					return entries[i].getBirthday(); 
				}
			}
		}
		return null; 
	}




	String[] getReminders(Birthday bd13) {
		//Part 1
		int nor = 0; 
		for (int i = 0; i < noe; i++) {
			if (entries[i].getBirthday().equals(bd13)) {
				nor++; 
			}
		}
		
		//Part 2
		String[] names = new String[nor]; 
		int nor2 = 0; 
		for (int i = 0; i < noe; i++) {
			if (entries[i].getBirthday().equals(bd13)) {
				names[nor2] = entries[i].getName(); 
				nor2++; 
			}
		}
		return names; 
	}




	String[] getReminders(int i, int j) {
		return this.getReminders(new Birthday(i , j)); 
	}




	void removeEntry(String string) {
		if (this.nameExists(string)) {
			Entry[] newEntries = new Entry[10]; 
			int nec = 0; 
			for (int i = 0; i < noe; i++) {
				if (!this.entries[i].getName().equals(string)) {
					newEntries[nec] = entries[i]; 
					nec++; 
				}
			}
			noe--; 
			entries = newEntries; 
		}
	}




	void addEntry(String name, int month, int day) {
		addEntry(name, new Birthday(month , day)); 
	}




	void addEntry(String string, Birthday bd13) {
		if (this.nameExists(string)) {
			for (int i = 0; i < noe; i++) {
				if (this.entries[i].getName().equals(string)) {
					entries[i].setBirthday(bd13);
				}
			}
		}
		else {
			entries[noe] = new Entry(string , bd13);  //BRAND NEW ENTRY
			noe++; 
		}
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false; 
		}
		boolean eq = false;
		BirthdayBook other = (BirthdayBook) obj;
		if (this.getNumberOfEntries() == other.getNumberOfEntries()) {
			eq = true; 
			for (int i = 0; eq && i < this.getNumberOfEntries(); i++) {
				eq = this.entries[i].equals(other.entries[i]); 
			}
		}
		return eq;
	}

}
