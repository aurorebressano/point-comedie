package metier.users;

import metier.users.Password;

public class Password {
	
	private String password;
	
	public Password(String pw) {
		// creer ici l'algo pour crypter
		this.password = pw;
	}

//	public String getPassword() {
//		return password;
//	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String decode() {
		return password;
	}

	public boolean verifPW(Password pw) {
		boolean reponse = false;
		if (password != null && pw != null) reponse = password.equals(pw.password);
		return reponse;
	}

	// TODO : A enlever - ATTENTION : que pour les tests
	@Override
	public String toString() {
		return "PassWord [password=" + password + "]";
	}
	}
