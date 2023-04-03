package GenderMagLab2;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;


public class Song <T1, T2, T3, T4> {

    private T1 songData1;
    private T2 songData2;
    private T3 songData3;
    private T4 songData4;

    public Song(T1 songData1, T2 songData2, T3 songData3, T4 songData4) {
        this.songData1 = songData1;
        this.songData2 = songData2;
        this.songData3 = songData3;
        this.songData4 = songData4;
    }

    public T1 getSongData1() {
        return songData1;
    }

    public void setSongData1(T1 songData1) {
        this.songData1 = songData1;
    }

    public T2 getSongData2() {
        return songData2;
    }

    public void setSongData2(T2 songData2) {
        this.songData2 = songData2;
    }

    public T3 getSongData3() {
        return songData3;
    }

    public void setSongData3(T3 songData3) {
        this.songData3 = songData3;
    }

    public T4 getSongData4() {
        return songData4;
    }

    public void setSongData4(T4 songData4) {
        this.songData4 = songData4;
    }

    @Override
    public String toString() {
        return " SongData1: " + songData1 + " SongData2: " + songData2 + " SongData3: "
        + songData3 + " SongData4: " + songData4;
    }	
    
    
    
    
    public void displayAllSongs (List <?> songs){
    	int count = 0;
    	for (Object song : songs) {
    		System.out.println(song);
    		count++;
    		
    	}
    }
    
   //read songs for linked list
    public static LinkedList<Song> readSongsLinkedList(String filename) throws FileNotFoundException {
    
    File file = new File("/Users/charlescetta/Downloads/Gendermagplaylist.txt");
    Scanner scanner = new Scanner(file);
    
 // Initialize the linked list to store the songs
    LinkedList<Song> songs = new LinkedList<>();
    
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] parts = line.split(","); 
        String title = parts[0];
        String artist = parts[1];
        String album = parts[2];
        String duration = parts[3];
        
        
      
        // Create a new Song object and add it to the linked list
        songs.add(new Song(title, artist, album, duration));
    }

    scanner.close();
    return songs;
  }
    
   
    	
  
     
    
    public static Song searchSongByName(Song[] songs, String name) {
        for (Song song : songs) {
            if (song.S().equalsIgnoreCase(name)) {
                return song;
            }
        }
        
        return null;
    }

    
    //Read songs for array
    public static Song[] readSongsArray(String filename) throws FileNotFoundException {
        File file = new File ("/Users/charlescetta/Downloads/Gendermagplaylist.txt");
        Scanner scanner = new Scanner(file);

       
     
        // Initialize the array to store the songs
        Song[] songs = new Song[25];

        // Read the song information from the file and create Song objects
        scanner = new Scanner(file);
        int i = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(","); // Assumes the format: "title,artist,duration,..."
            String title = parts[0];
            String artist = parts[1];
          String album = parts[2];
          String duration = parts[3];
            // Create a new Song object and add it to the array
            songs[i] = new Song(title, artist, album, duration);
            i++;
        }

        scanner.close();
        return songs;
    }

    
    
    
    public static void main(String[] args) {
    	
    	 
    	LinkedList<Song> songList = new LinkedList<>();
    	//Song 1 has Artist, Song Title, Album, and Song Time
    	Song s1 = new Song("Kendrick Lamar", "PRIDE", "DAMN.", "4:35");
    	//Song 2 has Artist, Song Title, Album, and Song ID
    	Song s2 = new Song("Kanye West", "Father Stretch My Hands Pt. 1", "Life of Pablo", "7961705");
    	// Song 3 has Song Title, Artist, Album, and Song ID
    	Song s3 = new Song("After the Storm" , "Kali Uchis, Tyler the Creator, Bootsy Collins", "Isolation", "  4465321");
    	Song s4 = new Song("Frank Ocean", "Chanel", "Chanel", "3:30");
    	Song s5 = new Song("Playboi Carti", "Long Time - Intro", "  Die Lit	", "3:31 ");
    	Song s6 = new Song("A Boogie Wit da Hoodie", " Skeezers	", "  Hoodie SZN", "3:18 ");
    	Song s7 = new Song("A$AP Ferg, Brent Faiyaz, Salaam Remi", "Dreams, Fairytales, Fantasies", " Floor Seats ", "3:42");
    	Song s8 = new Song(" Bryson Tiller", "Right My Wrongs ", "  TRAPSOUL", "4:09  ");
    	Song s9 = new Song("Lil Baby, Gunna, Lil Uzi Vert", " Life Goes On	", "Harder Than Ever", "4:07");
    	Song s10 = new Song("The Weeknd, Lana Del Rey", "Stargirl Interlude	", " Starboy", "1:51  ");
    	Song s11 = new Song("Rihanna", "Kiss It Better  ", " ANTI", "  4:13");
    	Song s12 = new Song(" Mac Miller", "Jet Fuel", " Swimming", "5:45");
    	Song s13 = new Song(" A Boogie Wit da Hoodie", " Still Think About You	", " Artist	", "4:06");
    	Song s14 = new Song("Frank Ocean", "Pink + White ", "  Blonde", "3:04 ");
    	Song s15 = new Song(" Travis Scott", "way back	", "Birds In The Trap Sing McKnight", "4:32 ");
    	Song s16 = new Song(" Juice WRLD", "Feeling	", "Death Race For Love	", "3:21   ");
    	Song s17 = new Song(" Kanye West", "Violent Crimes  ", "   ye", "3:35");
    	Song s18 = new Song(" Drake", " Practice ", "  Take Care  ", "  3:57");
    	Song s19 = new Song("Playboi Carti, Lil Uzi Vert", "Shoota", "Die Lit	", "2:33 ");
    	Song s20 = new Song("The Weeknd", " The Weeknd", "	Starboy	", "3:38");
    	Song s21 = new Song(" Kendrick Lamar, George Clinton, Thundercat", " Wesley's Theory", "To Pimp a Butterfly	", "4:47");
    	Song s22 = new Song("A Boogie Wit da Hoodie, Kodak Black", " Drowning", "The Bigger Artist ", "  3:29");
    	Song s23 = new Song(" Steve Lacy", " Only If ", "Apollo XXI	", "1:40");
    	Song s24 = new Song(" Frank Ocean", "Nights	", "Blonde	", "5:07");
    	Song s25 = new Song("  Kendrick Lamar, Rihanna", "LOYALTY. FEAT. RIHANNA. ", "DAMN.", "3:47");
    	
    	songList.add(s1);
    	songList.add(s2);
    	songList.add(s3);
    	songList.add(s4);
    	songList.add(s5);
    	songList.add(s6);
    	songList.add(s7);
    	songList.add(s8);
    	songList.add(s9);
    	songList.add(s10);
    	songList.add(s11);
    	songList.add(s12);
    	songList.add(s13);
    	songList.add(s14);
    	songList.add(s15);
    	songList.add(s16);
    	songList.add(s17);
    	songList.add(s18);
    	songList.add(s19);
    	songList.add(s20);
    	songList.add(s21);
    	songList.add(s22);
    	songList.add(s23);
    	songList.add(s24);
    	songList.add(s25);
     	
    	Song [] playlist;
    	playlist = new Song[25];
    	playlist[0] = s1;
    	playlist[1] = s2;
    	playlist[2] = s3;
    	playlist[3] = s4;
    	playlist[4] = s5;
    	playlist[5] = s6;
    	playlist[6] = s7;
    	playlist[7] = s8;
    	playlist[8] = s9;
    	playlist[9] = s10;
    	playlist[10] = s11;
    	playlist[11] = s12;
    	playlist[12] = s13;
    	playlist[13] = s14;
    	playlist[14] = s15;
    	playlist[15] = s16;
    	playlist[16] = s17;
    	playlist[17] = s18;
    	playlist[18] = s19;
    	playlist[19] = s20;
    	playlist[20] = s21;
    	playlist[21] = s22;
    	playlist[22] = s23;
    	playlist[23] = s24;
    	playlist[24] = s25;
    	
    	s1.displayAllSongs(songList);
    	System.out.println(songList.size()); 
    	
    	
    	/*
    	String filename = "/Users/charlescetta/Downloads/Gendermagplaylist.txt";
    	 try {
             // Read the songs from the file into a linked list
             LinkedList<Song> songs = Song.readSongsLinkedList(filename);

             // Print the songs
             for (Song song : songs) {
                 System.out.println(song);
             }
         } catch (FileNotFoundException e) {
             System.out.println("Error: File not found.");
         }
    	
    	 try {
             // Read the songs from the file into an array
             Song[] songs = Song.readSongsArray(filename);

             // Print the songs
             for (Song song : songs) {
                 System.out.println(song);
             }
         } catch (FileNotFoundException e) {
             System.out.println("Error: File not found.");
         }
     }
    */
    	 
    
    	
	}
}



