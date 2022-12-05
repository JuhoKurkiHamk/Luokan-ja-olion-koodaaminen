
public class JaakaappiApp {

	public static void main(String[] args) {

		Jaakaappi jaakaappi1 = new Jaakaappi();
		Jaakaappi jaakaappi2 = new Jaakaappi("Samsung", 180, true);
		
		jaakaappi1.printData();
		jaakaappi2.printData();
		
	
		
		

	}

}// end of the jaakaappi app

class Jaakaappi
{
	public String merkki;
	public boolean isOn;
	public int korkeus;
		
	// oletus muodostin
	public Jaakaappi()
	{
		merkki ="";
		isOn =false;
	}
	public Jaakaappi(String merkkiNimi, int merkinKorkeus, boolean onkoJaakaappiPaalla) // merkki, korkeus ja onko päällä/sammutettu
	{
		merkki = merkkiNimi;
		isOn = onkoJaakaappiPaalla;
		korkeus = merkinKorkeus;
	}
	
	public void printData() // tulostaa tiedot
	{
		System.out.println("Jaakaappi");
		System.out.println("Merkki: " + merkki);
		System.out.println("Jaakaapin korkeus: " + korkeus + "cm");
		if (isOn)
		{
			System.out.println("Jaakaappi on paalla");
		}
		else
		{
			System.out.println("Jaakaappi on pois paalta");
		}
	}
	
}