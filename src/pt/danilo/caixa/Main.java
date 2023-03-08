package pt.danilo.caixa;

import java.util.Scanner;

import pt.danilo.caixa.errors.NotEnoughWidthException;

public class Main {

	public static void main(String[] args) {//throws Exception {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Width: ");
		int width = leitor.nextInt();
		
		System.out.println("Height: ");
		int height = leitor.nextInt();
		
		Caixa caixa = new Caixa(width,height, '#');
		try {
		caixa.print();
		} catch(NotEnoughWidthException) {
			System.out.println("Ocorreu um erro ao desenhar a caixa!");
			//System.out.println(e.getMessage());
		}
		
	}
	
}
