package herança;

public class Atividade01 {

	public static void main(String[] args) {
		
		Cachorro A1= new Cachorro();
		Preguiça B1= new Preguiça();
		Cavalo C1= new Cavalo();
		
		
		A1.nome = ("Bolt");
		fazerSom(A1);
		A1.idade = 5;
		A1.correr = ("Sim");
		
		B1.nome = ("Prigs");
		fazerSom(B1);
		B1.idade = 35;
		B1.escalar = ("Sim");
		
		C1.nome = ("Spirit");
		fazerSom(C1);
		C1.idade = 8;
		C1.correr = ("Sim");
			 
		 }
	
	static void fazerSom(Animal sons) {
		 
		 System.out.println(sons.Som());

	}
}
