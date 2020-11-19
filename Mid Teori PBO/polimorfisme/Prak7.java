import java.util.Scanner;


class Prak7{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String name;
		String Alamat;
		
		System.out.print("Nama: ");
		name=input.nextLine();
		System.out.print("Alamat: ");
		Alamat=input.nextLine();
		
		
		
		Proses p = new Proses(name,Alamat);
		Pln l = new Proses(name,Alamat);
		
		p.pilihan();
		p.pembayaran();
		
		System.out.println("");
		System.out.println("		FORM PEMBAYARAN");
		System.out.println("Tanggal : "+p.getTanggal()+"  "+" Waktu sekarang : "+p.getWaktu());
		System.out.println("Nama                     : "+ l.getNama());
		System.out.println("Alamat                   : "+ l.getAlamat());
		System.out.println("Harga                    : "+"Rp."+ (p.getTotalharga()));
		System.out.println("Bayar                    : "+"Rp."+ p.getBayar());
		System.out.println("Kembalian                : "+"Rp."+ (p.getBayar()-(p.getTotalharga())));
		
		
		
	}
}
