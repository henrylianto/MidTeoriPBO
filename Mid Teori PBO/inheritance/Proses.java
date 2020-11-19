import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.DateFormat; 
import java.util.Date;   
  

class Proses extends Pln{
    	Scanner input = new Scanner(System.in);
	
private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    
private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
	
public void input(){
		System.out.print("Nama: ");
		nama = input.nextLine();
		System.out.print("Alamat: ");
		alamat = input.nextLine();

		
}
public void proses()
	{
		System.out.print("Banyak KWh Meteran: ");
		meteran = input.nextInt();
		boolean loop=true;
		
		while(loop){
		System.out.print("Tipe(31/32/33/34/35/40): ");
		tipe = input.nextInt();
		
			
		switch(tipe){
			case 31:
			 
			 harga = 100000;
			 totalharga=harga*meteran;
			 System.out.println("Tagihan   : Rp."+ totalharga);
			 loop=false;
		
			 
			break;
			
			case 32  :
			
			harga = 125000;
            totalharga=harga*meteran;
			System.out.println("Tagihan   : Rp."+ totalharga);
		    loop=false;
			
			break;
			
			case 33:
			 
			 harga = 450000;
            totalharga=harga*meteran;
			System.out.println("Tagihan   : Rp."+ totalharga);
		    loop=false;
			 
			break;
			
			case 34 :
			
			harga = 480000;
            totalharga=harga*meteran;
			System.out.println("Tagihan   : Rp."+ totalharga);
		    loop=false;
			
			break;			
			
			case 35 :
			
			harga = 500000;
            totalharga=harga*meteran;
			System.out.println("Tagihan   : Rp."+ totalharga);
		    loop=false;
			
			break;
			
			case 40 :
			
			harga = 550000;
            totalharga=harga*meteran;
			System.out.println("Tagihan   : Rp."+ totalharga);
		    loop=false;
		    
			break;
										
			default:
			System.out.println("Tipe tidak ditemukan, mohon ulangi");
			break;
			
			 
		}
	}
		
}				
public void pembayaran(){
    	
    	
    	System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		bayar= input.nextInt();
			
			
		while(bayar<(totalharga)){
			
			if(bayar<(totalharga)){
				System.out.println("Nominal Uang Kurang, Mohon cek kembali");
				
	            System.out.print("Bayar: "+"Rp.");
		        bayar= input.nextInt();
			
				}else{
					System.out.print("Bayar: "+"Rp.");
		        bayar= input.nextInt();
				}
	
		
		}
    	
}

public void cetak(){
		System.out.println("");
		System.out.println("		FORM PEMBAYARAN");
		System.out.println("Tanggal : "+getTanggal()+"  "+" Waktu sekarang : "+getWaktu());
		System.out.println("Nama pelanggan           : "+ nama);
		System.out.println("Alamat pelanggan         : "+ alamat);
		System.out.println("Nominal		         : Rp."+ totalharga);
		System.out.println("Jumlah bayar 	    	 : Rp."+ bayar);
		System.out.println("Kembalian                : Rp."+ (bayar-totalharga));
		
		
	}
  
	
}
