package Modelo;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.security.auth.x500.X500Principal;

public class Util {

	static Scanner scanner = new Scanner(System.in);
	DatoCsv superDatos = new DatoCsv();
	List<Persona> agendaGlobal = superDatos.mostrarDatos();

	public Util() throws IOException {
		super();
	}

	public void buscarNombre() { // 2. Se deben obtener los datos de "Giselle Marshall" e imprimirlos en
									// pantalla
		System.out.printf("ingrese algun nombre:");
		String busquedaNombre = scanner.nextLine();
		Optional<Persona> optionPersona = agendaGlobal.stream()
				.filter(x -> x.getNombre().toLowerCase().contains(busquedaNombre.toLowerCase())).findFirst();
		if (optionPersona.isPresent()) {
			Persona persona = optionPersona.get();
			System.out.printf("Nombre: %s \nCorreo: %s \nCiudad: %s \nMonto: %d\n", persona.getNombre(),
					persona.getCorreo(), persona.getCiudad(), persona.getSaldo());

		} else {
			System.out.println("la persona no se encuentra en el registro.\n");
		}

	}

	public void buscarCorreo() { // 4. Se deben obtener los datos
		System.out.printf("Ingrese Correo:");
		String correo = scanner.nextLine();
		Optional<Persona> optCorreo = agendaGlobal.stream()
				.filter(c -> c.getCorreo().toLowerCase().contains(correo.toLowerCase())).findFirst();

		if (optCorreo.isPresent()) {
			Persona persona = optCorreo.get();
			System.out.printf("Nombre: %s \nCorreo: %s \nCiudad: %s \nMonto: %d\n", persona.getNombre(),
					persona.getCorreo(), persona.getCiudad(), persona.getSaldo());

		} else {
			System.out.println("No se encontro correo\n");
		}
	}

	public void buscarCiudad() { // 5. Se deben almacenar en una estructura de datos todos las ciudades unicas
		Set<String> ciudadesUnicas = new HashSet<>();// Set almacena valores unicos
		agendaGlobal.stream().forEach(c -> ciudadesUnicas.add(c.getCiudad()));

		System.out.println("Las ciudades unicas son: " + ciudadesUnicas.size());

	}

	public void buscarElite() { // 6. Se deben contar todos los correos que posean en alguna parte de su
		String palabra = "elit";
		int resultado = (int) agendaGlobal.stream().filter(p -> p.getCorreo().contains(palabra)).count();
		System.out.println(resultado);

	}

	public void multiplicarTres() {// 7. Se deben multiplicar por 3 todos los montos en la colección, e
		List<Persona> resultados= agendaGlobal.stream().filter(m->(m.getSaldo()*3)>29000).collect(Collectors.toList());	
		System.out.println(resultados);

	}

	public void promedioMonto() { // 8. Calcular el promedio de todos los montos.
		Optional<Integer> promedio = agendaGlobal.stream().map(p-> (p.getSaldo())).reduce(Integer::sum);

		    System.out.println("el promedio es :"+promedio);
	    
	}

	public void datoMenor() {// 9. Obtener los datos de la persona con el monto menor.
		Set<Integer> minimo = new HashSet<>();
		 agendaGlobal.stream().forEach(m-> minimo.add(m.getSaldo()));
		Object minimos = Collections.min((minimo));
		System.out.println(Collections.min((minimo)));
	
	}

	public void datoMayor() {// 10. Obtener los datos de la persona con el monto mayo
		Set<Integer> maximo = new HashSet<>();
		 agendaGlobal.stream().forEach(m-> maximo.add(m.getSaldo()));
		System.out.println(Collections.max((maximo)));

	}
}
