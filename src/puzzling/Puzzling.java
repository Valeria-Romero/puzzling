package puzzling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Puzzling {

	public static void main(String[] args) {
		System.out.println("Reto 1");
		System.out.println(retoUno());
		System.out.println("Reto 2");
		System.out.println(retoDos());
		System.out.println("Reto 3");
		retoTres();
		System.out.println("Reto 4");
		System.out.println(retoCuatro());
		System.out.println("Reto 5");
		retoCinco();
		System.out.println("Reto 6");
		System.out.println(retoSeis());
		System.out.println("Reto 7");
		System.out.println(retoSiete());
	}

	public static ArrayList<Integer> retoUno() {

//		Declaramos el array
		int[] intArray = new int[] { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };

//		Imprimir la suma de todos los valores en el array
		int suma = 0;
		for (int i = 0; i < intArray.length; i++) {
			suma += intArray[i];
		}
		System.out.println(suma);

//		Nuevo arreglo para retornar solo los numeros mayores a 10;
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > 10) {
				newArray.add(intArray[i]);
			}
		}

		return newArray;
	}

	public static List<String> retoDos() {

//		Declaramos el array de palabras
		String[] names = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };

//		Lo convertimos a una lista
		List<String> namesList = Arrays.asList(names);
//		Para mezclar el arreglo usamos el paquete de Collections y el método shuffle
		Collections.shuffle(namesList);
//		Imprimimos la lista desordenada
		System.out.println(namesList);

//		Creamos una nueva lista que es la que vamos a devolver en el return
		List<String> newList = new ArrayList<String>();
//		Hacemos el ciclo para revisar si los nombres tienen más de 5 letras
		for (int i = 0; i < namesList.size(); i++) {
			if (namesList.get(i).length() > 5) {
				newList.add(namesList.get(i));
			}
		}

		return newList;
	}

	public static void retoTres() {
//		Declaramos una variable con todas las letras
		String alphabetString = "abcdefghijklmnopqrstuvwxyz";
//		Declaramos el array donde vamos a guardar cada letra en un index
		List<String> alphabet = new ArrayList<String>();
//	    Hacemos un ciclo para colocar cada letra en el índice definido 
		for (int i = 0; i < alphabetString.length(); i++) {
			alphabet.add(String.valueOf(alphabetString.charAt(i)));
		}
//		valueOf() devuelve el valor primitivo de un objeto String como un tipo de dato cadena
//	    charAt() devuelve el carácter en el índice definido
//	    Mezclamos el arreglo
		Collections.shuffle(alphabet);
//	    Buscamos la última letra y la imprimimos
		System.out.println(alphabet.get(alphabet.size() - 1));
//	    Buscamos la primer letra y si es vocal imprimos un mensaje
		System.out.println(alphabet.get(0));
//	    if(alphabet.get(0).contains("a") || alphabet.get(0).contains("e")) {
//	    	System.out.println("La primer letra es vocal");
//	    }
		String[] vowels = new String[] { "a", "e", "i", "o", "u" };
		for (String vowel : vowels) {
			if (alphabet.get(0).contains(vowel)) {
				System.out.println("La primer letra es vocal");
				break;
			}
		}
	}

	public static ArrayList<Integer> retoCuatro() {
		ArrayList<Integer> random10 = new ArrayList<Integer>();
		Random rand = new Random();

		for (int i = 1; i <= 10; i++) {
			random10.add(55 + rand.nextInt(100 - 55) + 1);
//          Formula = minimum + rand.nextInt((maximum - minimum) + 1);
		}

		return random10;
	}

	public static ArrayList<Integer> retoCinco() {
		ArrayList<Integer> random10 = new ArrayList<Integer>();
		Random rand = new Random();

		for (int i = 1; i <= 10; i++) {
			random10.add(55 + rand.nextInt(100 - 55) + 1);
		}
//      Usamos el método sort para ordenar la lista
		Collections.sort(random10);
		System.out.println(random10);

//      Número más bajo y más alto
		int min = random10.get(0);
		int max = random10.get(random10.size() - 1);
		System.out.println("El número más bajo es: " + min + "\n" + "El número más alto es: " + max);

		return random10;
	}

	public static String retoSeis() {
		Random rand = new Random();
		String alphabetString = "abcdefghijklmnopqrstuvwxyz";
		String word = "";
		
		for(int i=0; i < 5; i++) {
			word += alphabetString.charAt(rand.nextInt(26));
		}
		
		return word;
	}
	
	public static List<String> retoSiete(){
		List<String> wordList= new ArrayList<String>();
		
		for(int i=0; i<10; i++) {
			wordList.add(retoSeis());
		}
		
		return wordList;
	}

}
