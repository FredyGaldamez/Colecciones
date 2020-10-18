package Modelo;

public class Persona {
	
	private String nombre;
	private String correo;
	private String ciudad;
	private int saldo;
	
	public Persona() {}
	
	public Persona(String nombre, String correo, String ciudad, int saldo) {
		super();
		this.nombre  = nombre;
		this.correo = correo;
		this.ciudad = ciudad;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
		@Override
		public String toString() {
			return this.nombre + this.ciudad + this.correo + this.saldo;
		}
	

}
