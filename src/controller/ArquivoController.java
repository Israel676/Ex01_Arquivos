package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivoController implements InterfaceArq {

	public ArquivoController() {
		super();
	}

	@Override
	public void LerArquivo(String path, String name) throws IOException {
		File arq = new File(path, name);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null) {
				if(linha.contains("fruits") || linha.contains("Fruits")) {
					System.out.println(linha);
					System.out.println("\n");
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
