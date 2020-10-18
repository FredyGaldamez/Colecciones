package Presentacion;
import Modelo.*;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

//En el método main se deben ejecutar la llamada a los que métodos que harán lo siguiente. 
//La salida esperada debe ser en este formato cuando se pida el detalle de la persona

public class Main {

	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		DatoCsv datito = new DatoCsv();
		datito.mostrarDatos();
		Util util = new Util ();
//		util.buscarNombre();
//		
//		util.buscarCorreo();
		//util.buscarCiudad();
		//util.buscarElite();
		// util.multiplicarTres();
		 util.promedioMonto();
		 util.datoMenor();
		 util.datoMayor();
		
		
	
	}

	
	}


	
	

