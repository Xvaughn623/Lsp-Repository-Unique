package org.howard.edu.lsp.exam.question42;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//import java.util.Map.Entry;

public class SongsDatabase
{
	
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

 		/* Add a song title to a genre */
		public void addSong(String genre, String songTitle) 
		{
			Set<String> tempSet = new HashSet<String>();
			
			if(map.get(genre) == null)
			{
				tempSet.add(songTitle);
				map.put(genre, tempSet);
			}
			else 
			{
			tempSet = map.get(genre);
			tempSet.add(songTitle);
			map.put(genre, tempSet);
			}
			}


		/* Return the Set that contains all songs for a genre */
		public Set<String> getSongs(String genre) 
		{
    			return map.get(genre);
		}

		/* Return genre, i.e., jazz, given a song title */
		public String getGenreOfSong(String songTitle) 
		{
			String Genre = "temp";
			Iterator mapIterator = map.entrySet().iterator();
			
			while(mapIterator.hasNext())
			{
				Map.Entry mapElement = (Map.Entry)mapIterator.next();
				Set checker;
				checker = ((Set)mapElement.getValue());
				
				if(checker.contains(songTitle))
				{
					Genre = (String) mapElement.getKey();
				}
			}
			return Genre;
			
		}
			/*
			Set<String> tempSet;
			
    			for (String key: map.keySet())
    			{
    			if(map.get(key) tempSet) {
    				for (String listItem : m.get(key))
    				{
    					if (songTitle.equalsIgnoreCase(listItem))
    						break;
    				}
    			}
    			}
		}
		*/
}

