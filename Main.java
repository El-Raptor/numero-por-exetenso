package Extenso;

public class Main {
	public static void main(String[] args) {
		Reading r = new Reading();
		
		for (int i = 0; i < 1000; i++)
			System.out.println(r.read(i).toUpperCase());
	}
}
