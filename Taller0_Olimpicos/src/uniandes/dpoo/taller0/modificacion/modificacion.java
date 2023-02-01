package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class modificacion {
	
	private CalculadoraEstadisticas calculadora;
	
	public void ejecutarapp()
	{
		String archivo = "C:\\Users\\Samuel Ramírez\\OneDrive - Universidad de los Andes\\2023-1\\DPO\\Taller0_Olimpicos\\data";
		try
		{
			calculadora = LoaderOlimpicos.cargarArchivo(archivo);
			System.out.println("Se cargó el archivo " + archivo + " con información de los Juegos Olímpicos.");
			
			System.out.println("Los deportes para los que se tiene información son:");
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
		
      System.out.println(calculadora.paisConMasMedallistas());

      }
}
