package view;

import java.io.IOException;

import controller.Leitura;

public class Principal {

	public static void main(String[] args) throws IOException {
	
		Leitura read = new Leitura();
		String path = "C:\\TEMP";
		String nome = "generic_food.csv";
		
		read.readFile(path, nome);
		
		

	}

}
