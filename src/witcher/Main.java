package witcher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Witcher brujo= new Witcher();
		brujo.setName("Willy wonka");
		brujo.setHealth(1);
		brujo.setHasSoul(true);
		if(brujo.isDeath()) {
			System.out.println(brujo.getName()+" está muerto");
		}else {
			System.out.println(brujo.getName()+" está vivo");
		}//Esto es nuevo
	}

}
