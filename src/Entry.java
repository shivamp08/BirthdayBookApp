
public class Entry {
	
	String name; 
	Birthday bd; 

	Entry(String string, Birthday bd01) {
		this.name = string; 
		this.bd = bd01; 
	}

	Entry(String string, int m, int d) {
		this.name = string;
		this.bd = new Birthday(m , d); 
	}

	String getName() {
		return this.name;
	}

	Birthday getBirthday() {
		return this.bd;
	}
	
	void setBirthday(Birthday bd03) {
		this.bd = bd03; 
	}
	
	void setBirthday(int i, int j) {
		this.bd = new Birthday(i , j); 		
	}
	
	void setName(String string) {
		this.name = string; 
	}
	
	@Override
	public String toString() {
		return this.name+" was born on "+this.bd.toString(); 
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true; 
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		return this.toString().equals(obj.toString());
	}




}
