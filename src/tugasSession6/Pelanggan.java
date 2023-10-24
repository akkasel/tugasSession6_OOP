package tugasSession6;

import java.util.ArrayList;

public class Pelanggan {
	
	private String nama;
	private String alamat;
	private String telpon;
	
	private ArrayList<Pesanan> pesanans;


	public Pelanggan(String nama, String alamat, String telpon, ArrayList<Pesanan> pesanans) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.telpon = telpon;
		this.pesanans = pesanans;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getTelpon() {
		return telpon;
	}

	public void setTelpon(String telpon) {
		this.telpon = telpon;
	}
	
	public ArrayList<Pesanan> getPesanan(){
		return pesanans;
	}

}
