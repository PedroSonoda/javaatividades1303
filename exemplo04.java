package Atividade1303;

public class exemplo04 {

	public static void main(String[] args) {
		String espacos = "ispaço";
		String corrigir = espacos.replace("i", "e");
		
		String todosEspacos= "e s p a ç o";
		String tirarEspacos = todosEspacos.replaceAll(" ", " ");
		
		System.out.println("Antes: " + espacos + "Depois: " + corrigir);
		System.out.println("Antes: " + todosEspacos + " Depois " + tirarEspacos);
		// TODO Auto-generated method stub

	}

}
