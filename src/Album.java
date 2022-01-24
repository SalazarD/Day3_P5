
public class Album {
	
	private int albumId;
	private String albumName;
	private String artistName;
	private double price;
	private String genre;
	
	public Album(int albumId, String albumName, String artistName, double price, String genre) {
		
		this.albumId = albumId; 
		this.albumName = albumName; 
		this.artistName = artistName; 
		this.price = price;
		this.genre = genre;
		
	}

	public int getAlbumId() {
		return albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public String getArtistName() {
		return artistName;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Album [albumId=" + albumId + ", albumName=" + albumName + ", artistName=" + artistName + ", price="
				+ price + ", genre=" + genre + "]";
	}

	public String getGenre() {
		return genre;
	}

}
