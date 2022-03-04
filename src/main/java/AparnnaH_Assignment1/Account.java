public class Account {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private String email;

	public Account(AccountBuilder builder) {
		this.username = builder.username;
		this.password = builder.password;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.birthMonth = builder.birthMonth;
		this.birthDay = builder.birthDay;
		this.birthYear = builder.birthYear;
		this.email = builder.email;
	}
	public String getUsername() { return username; }

	public String getPassword() { return password; }

	public String getFirstName() { return firstName; }

	public String getLastName() { return lastName; }

	public int getBirthMonth() { return birthMonth; }

	public int getBirthDay() { return birthDay; }

	public int getBirthYear() { return birthYear; }

	public String getEmail() { return email; }

	public static class AccountBuilder {
		private String username;
		private String password;
		private String firstName;
		private String lastName;
		private int birthMonth;
		private int birthDay;
		private int birthYear;
		private String email;

		public AccountBuilder(String username, String password, String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String email){
			this.username = username;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
			this.birthMonth = birthMonth;
			this.birthDay = birthDay;
			this.birthYear = birthYear;
			this.email = email;
		}

		public AccountBuilder setUsername(String username){
			this.username = username;
			return this;
		}
		public AccountBuilder setPassword(String password){
			this.password = password;
			return this;
		}
		public AccountBuilder setFirstName(String firstName){
			this.firstName = firstName;
			return this;
		}
		public AccountBuilder setLastName(String lastName){
			this.lastName = lastName;
			return this;
		}
		public AccountBuilder setBirthMonth(int birthMonth){
			this.birthMonth = birthMonth;
			return this;
		}
		public AccountBuilder setBirthDay(int birthDay){
			this.birthDay = birthDay;
			return this;
		}
		public AccountBuilder setBirthYear(int birthYear){
			this.birthYear = birthYear;
			return this;
		}
		public AccountBuilder setEmail(String email){
			this.email = email;
			return this;
		}

		public Account build() {
			return new Account(this);
		}
	}
}

