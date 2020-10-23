package Extenso;

public class Reading {
	
	public Reading() {
		
	}
	
	private int digitsCount(int number) {
		String n = String.valueOf(number);
		
		return n.length();
	}
	
	public String read(int number) {
		int digits = digitsCount(number);
		
		if (digits == 1)
			return unity(number);
		if (digits == 2)
			return twoDigits(number);
		
		return hundreds(number);
	}
	
	private String unity(int number) {
		
		if (number == 0)
			return "Zero";
		
		if (number == 1)
			return "Um";
		
		if (number == 2)
			return "Dois";
		
		if (number == 3)
			return "Três";
		
		if (number == 4)
			return "Quatro";
		
		if (number == 5)
			return "Cinco";
		
		if (number == 6)
			return "Seis";
		
		if (number == 7)
			return "Sete";
		
		if (number == 8)
			return "Oito";
		
		return "Nove";
	}
	
	private String twoDigits(int number) {
		String dicker = "";
		String n = String.valueOf(number);
		
		if (n.charAt(0) == '0')
			return unity(number % 10);
		
		if (n.charAt(0) == '1') {
			if (number == 10)
				return "Dez";
			
			else if (number == 11)
				return "Onze";
			
			else if (number == 12)
				return "Doze";
			
			else if (number == 13)
				return "Treze";
			
			else if (number == 14)
				return "Quatorze";
			
			else if (number == 15)
				return "Quinze";
			
			else if (number == 16)
				return "Dezesseis";
			
			else if (number == 17)
				return "Dezessete";
			
			else if (number == 18)
				return "Dezoito";
			
			else
				return "Dezenove";
		}
		
		if (n.charAt(0) == '2') {
			if (number == 20)
				return "Vinte";
			
			dicker = "Vinte";			
			dicker += " E " + unity(number % 10);
		} else if (n.charAt(0) == '3') {
			if (number == 30)
				return "Trinta";
			
			dicker = "Trinta";			
			dicker += " E " + unity(number % 10);
		} else if (n.charAt(0) == '4') {
			if (number == 40)
				return "Quarenta";
			
			dicker = "Quarenta";			
			dicker += " E " + unity(number % 10);
		} else if (n.charAt(0) == '5') {
			if (number == 50)
				return "Cinquenta";
			
			dicker = "Cinquenta";			
			dicker += " E " + unity(number % 10);
		} else if (n.charAt(0) == '6') {
			if (number == 60)
				return "Sessenta";
			
			dicker = "Sessenta";			
			dicker += " E " + unity(number % 10);
		} else if (n.charAt(0) == '7') {
			if (number == 70)
				return "Setenta";
			
			dicker = "Setenta";			
			dicker += " E " + unity(number % 10);
		} else if (n.charAt(0) == '8') {
			if (number == 80)
				return "Oitenta";
			
			dicker = "Oitenta";			
			dicker += " E " + unity(number % 10);
		} else if (n.charAt(0) == '9') {
			if (number == 90)
				return "Noventa";
			
			dicker = "Noventa";			
			dicker += " E " + unity(number % 10);
		}
		
		return dicker;
	}
	
	private String hundreds(int number) {
		String hundred = "";
		String n = String.valueOf(number);
		
		if (n.charAt(0) == '1') {
			if (number == 100)
				return "Cem";

			int digits = digitsCount(number % 100);
			hundred = "Cento E ";
			// Verifica se o resto da divisão por 100 tem duas ou uma casa.
			hundred += digits > 1 ?  twoDigits(number % 100) : unity(number % 100);
		} else if (n.charAt(0) == '2') {
			hundred = "duzentos";
			if (number % 200 == 0)
				return hundred;
			
			int digits = digitsCount(number % 100);
			hundred += " E ";
			hundred += digits > 1 ?  twoDigits(number % 100) : unity(number % 100);
		} else if (n.charAt(0) == '3') {
			hundred = "trezentos";
			if (number % 300 == 0)
				return hundred;
			
			int digits = digitsCount(number % 100);
			hundred += " E ";
			hundred += digits > 1 ?  twoDigits(number % 100) : unity(number % 100);
		} else if (n.charAt(0) == '4') {
			hundred = "qatrocentos";
			if (number % 400 == 0)
				return hundred;
			
			int digits = digitsCount(number % 100);
			hundred += " E ";
			hundred += digits > 1 ?  twoDigits(number % 100) : unity(number % 100);
		} else if (n.charAt(0) == '5') {
			hundred = "quinhentos";
			if (number % 500 == 0)
				return hundred;
			
			int digits = digitsCount(number % 100);
			hundred += " E ";
			hundred += digits > 1 ?  twoDigits(number % 100) : unity(number % 100);
		} else if (n.charAt(0) == '6') {
			hundred = "seiscentos";
			if (number % 600 == 0)
				return hundred;
			
			int digits = digitsCount(number % 100);
			hundred += " E ";
			hundred += digits > 1 ?  twoDigits(number % 100) : unity(number % 100);
		} else if (n.charAt(0) == '7') {
			hundred = "setecentos";
			if (number % 700 == 0)
				return hundred;
			
			int digits = digitsCount(number % 100);
			hundred += " E ";
			hundred += digits > 1 ?  twoDigits(number % 100) : unity(number % 100);
		}else if (n.charAt(0) == '8') {
			hundred = "oitocentos";
			if (number % 800 == 0)
				return hundred;
			
			int digits = digitsCount(number % 100);
			hundred += " E ";
			hundred += digits > 1 ?  twoDigits(number % 100) : unity(number % 100);
		} else if (n.charAt(0) == '9') {
			hundred = "novecentos";
			if (number % 900 == 0)
				return hundred;
			
			int digits = digitsCount(number % 100);
			hundred += " E ";
			hundred += digits > 1 ?  twoDigits(number % 100) : unity(number % 100);
		}
			
		return hundred;
	}
}
