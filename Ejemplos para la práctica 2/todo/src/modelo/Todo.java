package modelo;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
//JAX apoya una correspondencia automatica desde una clase JAXB con anotaciones a XML y JSON
public class Todo {
	private String resumen;
	private String descripcion;
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
