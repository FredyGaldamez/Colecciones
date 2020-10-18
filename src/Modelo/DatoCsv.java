package Modelo;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DatoCsv {

	public List<Persona> mostrarDatos() throws IOException {
		List<Persona> agenda = loadCSV();
		agenda.stream().map(x -> x.toString()).forEach(System.out::println);

		//System.out.println(agenda);
		return agenda;
	}

	private List<Persona> loadCSV() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("datos.csv"));

		return br.lines().map(line -> line.split(","))
				.map(values -> new Persona(values[0], values[1], values[2], Integer.parseInt(values[3])))
				.collect(Collectors.toList());

	}

}

		
		
		
		
		
		

