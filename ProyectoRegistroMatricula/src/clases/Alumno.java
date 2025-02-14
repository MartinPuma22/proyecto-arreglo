package clases;

public class Alumno 
{	//Declarar Atributos privados
	private int codAlumno, edad, celular, sexo, estado;
	private String nombres, apellidos, dni;
	//Constructor
	public Alumno(int codAlumno, int edad, int celular, int sexo, int estado, String nombres, String apellidos,
			String dni) {
		this.codAlumno = codAlumno;
		this.edad = edad;
		this.celular = celular;
		this.sexo = sexo;
		this.estado = estado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	//Métodos de acceso públicos set/get
	public int getCodAlumno() {
		return codAlumno;
	}
	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
