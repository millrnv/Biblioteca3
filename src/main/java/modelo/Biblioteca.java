package modelo;


import modelo.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
	private String nombreBiblioteca;
	private String direccion;
	private ArrayList<Libro> libros;

	private List<Prestamo> prestamos;
	private List<Usuario> usuarios;
	private List<Bibliotecario> bibliotecarios;



	public Biblioteca(String nombreBiblioteca, String direccion) {
		this.nombreBiblioteca = nombreBiblioteca;
		this.direccion = direccion;
		libros = new ArrayList<>();
		this.prestamos = new ArrayList<>();
		this.usuarios = new ArrayList<>();
		this.bibliotecarios = new ArrayList<>();

	}

	public String getNombreBiblioteca() {
		return this.nombreBiblioteca;
	}

	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Libro> getLibros() {
		throw new UnsupportedOperationException();
	}

	public void setLibros(List<Libro> libros) {
		throw new UnsupportedOperationException();
	}

	


}