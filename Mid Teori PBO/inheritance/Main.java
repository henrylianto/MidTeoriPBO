import java.util.Scanner;
class Main{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		Proses p = new Proses();
		
		p.input();
		p.proses();
		p.pembayaran();
		p.cetak();
		
	}
}
