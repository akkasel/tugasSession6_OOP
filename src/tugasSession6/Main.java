package tugasSession6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pelanggan> listPelanggan = new ArrayList<>();
		ArrayList<Pesanan> listPesanan = new ArrayList<>();
		ArrayList<Barang> listBarang = new ArrayList<>();
		
		Pelanggan pelangganx = new Pelanggan("", "", "", listPesanan);
		ArrayList<Pesanan> pesanans = pelangganx.getPesanan();
		
		Barang barangx = new Barang("", 0, listPesanan);
		ArrayList<Pesanan> pesananz = barangx.getPesanan();
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		do {
			
			System.out.println("1. Tambah Pelanggan");
			System.out.println("2. Tambah Pesanan");
			System.out.println("3. Hapus Pelanggan");
			System.out.println("4. Hapus Pesanan");
			System.out.println("5. Tampilkan Pelanggan");
			System.out.println("6. Tampilkan Pesanan");
			System.out.println("7. Keluar");
			
			System.out.println();
			
			System.out.print("Pilih : ");
			input = sc.nextInt();
			sc.nextLine();  // Membersihkan newline
			
			System.out.println();
			
			if(input == 1) {
				// Tambah pelanggan
				String inputNama;
				System.out.print("Masukkan nama pelanggan: ");
				inputNama = sc.nextLine();
				String inputAlamat;
				System.out.print("Masukkan alamat: ");
				inputAlamat = sc.nextLine();
				String inputTelpon;
				System.out.print("Masukkan telpon: ");
				inputTelpon = sc.nextLine();
				
				// Pesanan pesanan = new Pesanan(inputNama, "...", 0, 0);
				Pelanggan pelanggan = new Pelanggan(inputNama, inputAlamat, inputTelpon, listPesanan);
				listPelanggan.add(pelanggan);
				
				System.out.println("Data pelanggan sudah tersimpan!");
			}
			else if(input == 2) {
				
				// Tampilkan pelanggan
				System.out.println("LIST PELANGGAN");
				
				if(listPelanggan.size() == 0) {
					System.out.println("Data pelanggan masih kosong");
				}
				
				int x=1;
				
				for(Pelanggan p : listPelanggan) {
					System.out.println("Pelanggan nomor urut " + x);
					System.out.println("Nama: " + p.getNama());
					System.out.println("------------------------------");
					x++;
				}
				
				
				// Tambah pesanan
				System.out.println("Masukkan nama pelanggan (wajib sesuai list di atas):");
				String inputNamaPelangganPadaPesanan = sc.nextLine();
				
				int cek = 0;
				
				for(int i=0;i<listPelanggan.size();i++) {
					if(listPelanggan.get(i).getNama().equals(inputNamaPelangganPadaPesanan)) {
						cek = 1;
						System.out.println("Nama terdaftar di sistem, silahkan lanjut lengkapi data-data di bawah ini.");
						
						System.out.println("Masukkan nama barang :");
						String inputNamaBarangPadaPesanan = sc.nextLine();
						System.out.println("Masukkan jumlah :");
						int inputJumlahBarangPadaPesanan = sc.nextInt();
						System.out.println("Masukan harga :");
						double inputHargaPadaPesanan = sc.nextDouble();
						
						// Stok Awal tidak diatur User, jadi random aja, misal semua barang stok awalnya 100;
						Barang barang = new Barang(inputNamaBarangPadaPesanan, 100-inputJumlahBarangPadaPesanan, pesananz);
						listBarang.add(barang);
						Pesanan pesanan = new Pesanan(inputNamaPelangganPadaPesanan, inputNamaBarangPadaPesanan, inputJumlahBarangPadaPesanan, inputHargaPadaPesanan);
						listPesanan.add(pesanan);
						
						System.out.println("Data pesanan sudah tersimpan!");
					}
				}
				
				if(cek == 0) {
					System.out.println("Nama Pelanggan belum terdaftar disistem, silahkan lengkapi ke menu nomor 1 terlebih dahulu!");
				}
				
				
			}
			else if(input == 3) {
				int checker = 0;
				
				// Tampilkan pelanggan
				System.out.println("LIST PELANGGAN");
				
				if(listPelanggan.size() == 0) {
					System.out.println("Data pelanggan masih kosong");
				}
				
				int x=1;
				
				for(Pelanggan p : listPelanggan) {
					System.out.println("Pelanggan nomor urut " + x);
					System.out.println("Nama: " + p.getNama());
					System.out.println("Alamat: " + p.getAlamat());
					System.out.println("Telpon: " + p.getTelpon());
					System.out.println("------------------------------");
					x++;
				}
				
				// Hapus pelanggan
				System.out.println("Masukan nama pelanggan yang mau dihapus : ");
				String inputNamaPelangganYangMauDihapus = sc.nextLine();
				for(int i=0;i<listPelanggan.size();i++) {
					if(listPelanggan.get(i).getNama().equals(inputNamaPelangganYangMauDihapus)) {
						listPelanggan.remove(i);
						checker = 1;
					}
				}
				if(checker != 1) {
					System.out.println("Pelanggan dengan nama tersebut tidak ditemukan");
				}
				else {
					System.out.println("Data pelanggan dengan nama tersebut sudah berhasil dihapus!");
				}
				
			}
			else if(input == 4) {
				
				// Tampilkan pesanan
				int i = 0;
				int j = 0;
				int count = 0;
				System.out.println("LIST PESANAN");
				if(listPesanan.size() == 0) {
					System.out.println("Data pesanan masih kosong");
				}
				
				for(Pesanan ps : pesanans) {
					System.out.println("Pesanan nomor urut ke "+ "- " + count);
					System.out.println("Nama Pelanggan: " + listPelanggan.get(i).getNama());
					System.out.println("Nama Barang: " + listBarang.get(j).getNamaBarang());
					System.out.println("Jumlah: " + ps.jumlah);
					System.out.println("Harga: " + ps.harga);
					i++;
					j++;
				}
				
				// Hapus pesanan
				int checker = 0;
				
				System.out.println("Masukan nomor urutan pesanan yang mau dihapus : ");
				int inputNomorUrutPesananYangMauDihapus = sc.nextInt();
				if(listPelanggan.get(inputNomorUrutPesananYangMauDihapus) != null) {
					listPesanan.remove(inputNomorUrutPesananYangMauDihapus);
					System.out.println("Data pesanan dengan nomor tersebut sudah berhasil dihapus!");
				}
				else {
					System.out.println("Pesanan dengan nomor urut tersebut tidak tersedia");
				}
				
			}
			else if(input == 5) {
	
				// Tampilkan pelanggan
				System.out.println("LIST PELANGGAN");
				
				if(listPelanggan.size() == 0) {
					System.out.println("Data pelanggan masih kosong");
				}
				
				int x=1;
				
				for(Pelanggan p : listPelanggan) {
					System.out.println("Pelanggan nomor urut " + x);
					System.out.println("Nama: " + p.getNama());
					System.out.println("Alamat: " + p.getAlamat());
					System.out.println("Telpon: " + p.getTelpon());
					System.out.println("------------------------------");
					x++;
				}
				
			}
			else if(input == 6) {
				// Tampilkan pesanan
				int i = 0;
				int j = 0;
				int count = 0;
				System.out.println("LIST PESANAN");
				if(listPesanan.size() == 0) {
					System.out.println("Data pesanan masih kosong");
				}
				
				for(Pesanan ps : pesanans) {
					System.out.println("Pesanan nomor urut ke "+ "- " + count);
					System.out.println("Nama Pelanggan: " + listPelanggan.get(i).getNama());
					System.out.println("Nama Barang: " + listBarang.get(j).getNamaBarang());
					System.out.println("Jumlah: " + ps.jumlah);
					System.out.println("Harga: " + ps.harga);
					i++;
					j++;
				}
			}
			
			System.out.println("");
			
			
		}while(input != 7);
	}

}
