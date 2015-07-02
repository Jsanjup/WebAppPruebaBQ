package bq.prueba;

public class Usuario {
	private String name;
	private String email;
	private String nick;
	
	public Usuario(){
	}
	
	public Usuario (String name, String email, String nick){
		this.name = name;
		this.email = email;
		this.nick = nick;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getNick(){
		return nick;
	}
	
	public void setNick(String nick){
		this.nick = nick;
	}
}
