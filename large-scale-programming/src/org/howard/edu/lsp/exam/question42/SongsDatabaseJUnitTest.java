package org.howard.edu.lsp.exam.question42;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseJUnitTest
{
	@Test
	@DisplayName("Test Case for returning a set that contains songs for a genre")
		public void testGetSongs()
		{
		SongsDatabase db = new SongsDatabase();
		Set<String> s = new HashSet<String>();
		
		s.add("Bubble");
		s.add("Soap");
		s.add("Water");
		
		db.addSong("Pop", "Bubble");
		db.addSong("Pop", "Soap");
		db.addSong("Pop", "Water");
		
		assertEquals(s, db.getSongs("Pop"));
		}
		//tests the get song function

	@Test
	@DisplayName("Test Case for getting the Genre of a Song")
		
	
		public void testGenreOfSong()
		{
		SongsDatabase db = new SongsDatabase();
		String correct = "Rap";
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		
		assertEquals(correct, db.getGenreOfSong("Savage"));
		}

	@Test
	@DisplayName("Test Case for Adding a song")
		public void testAddSong()
		{
		SongsDatabase db = new SongsDatabase();
		Set<String> s = new HashSet<String>();
		
		s.add("Bubble");
		s.add("Soap");
		s.add("Water");
		s.add("Bath");
		
		db.addSong("Pop", "Bubble");
		db.addSong("Pop", "Soap");
		db.addSong("Pop", "Water");
		db.addSong("Pop", "Bath");
		
		assertEquals(s, db.getSongs("Pop"));
		}
	/** Almost identical to the first one, but if this passes, then a 
	 * song was added correctly. I know technically this must have worked for
	 * the others to have worked, but this way shows it too.
		**/
		

}