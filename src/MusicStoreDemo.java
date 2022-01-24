import java.util.ArrayList;
import java.util.HashSet;

public class MusicStoreDemo {
	
	public static void main(String[] args) {
		ArrayList<Album> albums = new ArrayList<Album>();
		albums.add(new Album(1,"Thriller","Michael Jackson",10.49, "Pop"));
		albums.add(new Album(2,"OK Computer","Radiohead",12.99, "Alternative"));
		albums.add(new Album(3,"Under the Pink","Tori Amos",11.99, "Alternative"));
		albums.add(new Album(4,"The Bends","Radiohead",12.99, "Alternative"));
		albums.add(new Album(5,"Steel Wheels","Rolling Stones",9.99, "Rock"));
		
		ArrayList<Album> result = getAlbumsByArtist(albums, "RADIOHEAD");
		for (int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
			}
		
		System.out.println(); // print a blank line
		HashSet<String> artists = getAllArtists(albums);
		for (String artist: artists) {
		System.out.println(artist);
		}
		
		System.out.println(); // print a blank line
		HashSet<String> genres = getAllGenres(albums);
		for (String genre: genres) {
		System.out.println(genre);
		}
		
		System.out.println("These Albums are cheaper than 12.99: ");
	
		ArrayList<Album> cheaper = getAlbumsCheaperThan(albums, 12.99);
		for (int i=0; i<cheaper.size(); i++) {
			System.out.println(cheaper.get(i));
		}
	}
	
	
	public static HashSet<String> getAllGenres(ArrayList<Album> albums) {
		HashSet<String> genres = new HashSet<String>();
		for (int i=0; i< albums.size(); i++) {
		Album album = albums.get(i);
		genres.add(album.getGenre());
		}
		return genres;
		}
	
	public static HashSet<String> getAllArtists(ArrayList<Album> albums) {
		HashSet<String> artists = new HashSet<String>();
		for (int i=0; i< albums.size(); i++) {
		Album album = albums.get(i);
		artists.add(album.getArtistName());
		}
		return artists;
		}
	
	
	
	
	public static ArrayList<Album> getAlbumsCheaperThan(ArrayList<Album> albums, double price){
		
		ArrayList<Album> matches = new ArrayList<Album>();

		for (int i=0; i<albums.size(); i++) {
			if(albums.get(i).getPrice() < price) {
				matches.add(albums.get(i));
			}
		}
		
		return matches;
		
		
		
	}
	
	
	public static ArrayList<Album> getAlbumsByArtist(ArrayList<Album> albums, String artist) {
	ArrayList<Album> matches = new ArrayList<Album>();
	
	// loop through the albums passed in {
	for (int i=0; i<albums.size(); i++) {
		Album album = albums.get(i);
	// if this album's artist matches the artist passed in
	// (non-case sensitive match) {
		if (album.getArtistName().equalsIgnoreCase(artist)) {
	// Add this album to the ArrayList
				matches.add(album);
	// }
	}
	// } // end loop
	}
	return matches;
	}

}
