package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
	
	public Leitura() {
		super();
	}
	
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null) {
				String[] frutas = linha.split(","); 
				if(frutas[2].equals("Fruits")) { //verifica se é do grupo das frutas
					System.out.println(frutas[0] + "\t" + frutas[1] + "\t" + frutas[3]);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		}else {
			throw new IOException("Arquivo Inválido");
		}
		
	}

}
