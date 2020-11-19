import java.util.Scanner;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat; 

public class Proses extends Pln
{ 	private int bayar;
	private int harga;
	private int meteran;
	private int tipe;
	private int totalharga;
    
	public Proses(String nama, String alamat ){
		
		super(nama,alamat);
		this.bayar = bayar;	
		this.harga = harga;
		this.meteran = meteran;
		this.tipe = tipe;
		this.totalharga = totalharga;
	}

	public int getBayar(){
		return bayar;
	}
	public int getHarga(){
		return harga;
	}
	public int getMeteran(){
		return meteran;
	}
	public int getTipe(){
		return tipe;
	}
	public int getTotalharga(){
		return totalharga;
	}
	public String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    
    public String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
	

	public void pilihan(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Banyak KWh Meteran: ");
		meteran = input.nextInt();
		boolean loop=true;
		
		while(loop){
		System.out.print("Tipe(31/32/33/34/35/40): ");
		tipe = input.nextInt();
		
			
		switch(tipe){
			case 31:
			 
			 harga = 100000;
			 totalharga = harga*meteran;
			 System.out.println("Tagihan   : Rp."+ totalharga);
			 loop=false;
		
			 
			break;
			
			case 32  :
			
			harga = 125000;
			totalharga = harga*meteran;
			 System.out.println("Tagihan   : Rp."+ totalharga);
			 loop=false;
			
			break;
			
			case 33:
			 
			 harga = 450000;
			totalharga = harga*meteran;
			 System.out.println("Tagihan   : Rp."+ totalharga);
			 loop=false;
			 
			break;
			
			case 34 :
			
			harga = 480000;
		totalharga = harga*meteran;
			 System.out.println("Tagihan   : Rp."+ totalharga);
			 loop=false;
			
			break;			
			
			case 35 :
			
			harga = 500000;
		totalharga = harga*meteran;
			 System.out.println("Tagihan   : Rp."+ totalharga);
			 loop=false;
			
			break;
			
			case 40 :
			
			harga = 550000;
		totalharga = harga*meteran;
			 System.out.println("Tagihan   : Rp."+ totalharga);
			 loop=false;
			
			break;
										
			default:
			System.out.println("Blok tidak ditemukan, mohon ulangi");
			break;
			
			 
		}
	}
		
}
	
	public void pembayaran()
	{
		Scanner input = new Scanner(System.in);
    	
    	System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		bayar= input.nextInt();
			
			
		while(bayar<totalharga){
			
			if(bayar<totalharga){
				System.out.println("uang anda kurang mohon masukkan dengan nominal yang lebih besar");
				
	            System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        bayar= input.nextInt();
			
				}
				else{
					System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        bayar= input.nextInt();
				}
	
		
		}
	}
		
}
