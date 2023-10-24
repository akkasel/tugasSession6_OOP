package tugasSession6;

import java.util.ArrayList;

public class Barang {
	
	private String namaBarang;
	private int stok;
	
	private ArrayList<Pesanan> pesanans;
	
	public Barang(String namaBarang, int stok, ArrayList<Pesanan> pesanans) {
		super();
		this.namaBarang = namaBarang;
		this.stok = stok;
		this.pesanans = pesanans;
	}
	
	public String getNamaBarang() {
		return namaBarang;
	}
	
	public void setNama(String namaBarang) {
		this.namaBarang = namaBarang;
	}
	
	public int getStok() {
		return stok;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}

	public ArrayList<Pesanan> getPesanan(){
		return pesanans;
	}
	

}
