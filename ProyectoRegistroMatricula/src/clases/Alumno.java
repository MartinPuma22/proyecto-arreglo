package clases;

public class Alumno {

	//Declarar Atributos privados
	private Long codAlumno;
	private int  edad, celular, sexo, estado;
	private String nombres, apellidos, dni;
	//Constructor
	public Alumno(Long codAlumno, int edad, int celular, int sexo, int estado, String nombres,
			String dni) {
		this.codAlumno = codAlumno;
		this.edad = edad;
		this.celular = celular;
		this.sexo = sexo;
		this.estado = estado;
		this.nombres = nombres;
		this.dni = dni;
	}

	public Alumno() {

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public Long getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(Long codAlumno) {
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

	@Override
	public String toString() {
		return "Alumno{" +
				"codAlumno=" + codAlumno +
				", edad=" + edad +
				", celular=" + celular +
				", sexo=" + sexo +
				", estado=" + estado +
				", nombres='" + nombres + '\'' +
				", apellidos='" + apellidos + '\'' +
				", dni='" + dni + '\'' +
				'}';
	}
}
