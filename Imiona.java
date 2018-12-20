import java.util.Scanner;

public class Imiona {

static boolean isNameFemale(String name)
{
	if (name.endsWith("a")) {
		return true; 
		}
	else {
		return false;
		}
}
	public static void main(String[] args) {
		Scanner skaner=new Scanner(System.in);
		System.out.println("Podaj imie:");
		String imie=skaner.next();
        if(isNameFemale(imie)) {
        	 System.out.println("Na pewno jesteœ kobiet¹.");
        }
        else {  System.out.println("Nie jestem pewien, czy jesteœ kobiet¹.");
        }
	}

}