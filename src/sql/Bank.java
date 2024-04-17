package sql;

public class Bank {

		int accountno;
		String name;
		String branch;
		int mobileno;
		public int getAccountno() {
			return accountno;
		}
		public void setAccountno(int accountno) {
			this.accountno = accountno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public int getMobilno() {
			return mobileno;
		}
		public void setMobilno(int mobilno) {
			this.mobileno = mobilno;
		}
		public Bank() {
		}
		
		
		
		public Bank(int accountno, String name, String branch, int mobileno, String locaton) {
			
			this.accountno = accountno;
			this.name = name;
			this.branch = branch;
			this.mobileno = mobileno;
		}
		@Override
		public  String toString() {
			return "Bank [accountno=" + accountno + ", name=" + name + ", branch=" + branch + ", mobileno=" + mobileno
					+ "]";
		}
		
		
		
		
	}


