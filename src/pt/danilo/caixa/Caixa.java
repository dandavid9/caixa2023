package pt.danilo.caixa;

import pt.danilo.caixa.errors.NotEnoughHeightException;
import pt.danilo.caixa.errors.NotEnoughWidthException;

public class Caixa {

	private int width;
	private int height;
	private char symbol;
	
	public Caixa(int width, int height) {
		this(width, height, '*');
	}

	public Caixa(int width, int height, char symbol) {
		this.width = width;
		this.height = height;
		this.symbol = symbol;
	}
	
	public void print() throws NotEnoughWidthException, NotEnoughHeightException {
		if (width < 4) {
//			width = 4;
			//Unchecked exception
			//throw new RuntimeException("Width cannot be less than 4");
			
			//Checked exception
			//throw new Exception("Width cannot be less than 4");
			throw new NotEnoughWidthException("Width cannot be less than 4");
		}
		if (height < 4) {
//			height = 4;
			//Unchecked exception
			//throw new RuntimeException("Height cannot be less than 4");
			
			//Checked exception
			//throw new Exception("Height cannot be less than 4");
			throw new NotEnoughHeightException("Height cannot be less than 4");
		}
		printTopOrBottom();
		printLeftAndRight();
		printTopOrBottom();
	}

	private void printTopOrBottom() {
		for (int i = 0; i < width; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}
	
	private void printLeftAndRight() {
		for (int i = 0; i <  height - 2; i++) {
			System.out.print(symbol);
			for (int j = 0; j < width - 2; j++) {
				System.out.print(" ");
			}
			System.out.println(symbol);
		}
	}
	
}
