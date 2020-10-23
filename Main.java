package Extenso;

public class Main {
	public static void main(String[] args) {
		Reading r = new Reading();
		
		int i = 1024;
		
		while (i < 10000) {
			System.out.println(r.read(i).toUpperCase() + " " + i);
			i = i + 500;
		}
	}
}
