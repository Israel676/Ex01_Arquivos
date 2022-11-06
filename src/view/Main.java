package view;

import java.io.IOException;

import controller.ArquivoController;
import controller.InterfaceArq;

public class Main {

	public static void main(String[] args) {
		
		InterfaceArq op = new ArquivoController();
		String path = "C:\\TEMP";
		String name = "generic_food.csv";
		
		try {
			op.LerArquivo(path, name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
