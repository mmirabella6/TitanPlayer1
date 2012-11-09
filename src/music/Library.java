/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

import java.util.ArrayList;
import java.util.List;


public class Library {
   
    
    List<Song> songs;
    
    public Library(){
        songs = new ArrayList<Song>();
    }
    
    public void addSong(Song songToAdd){
        songs.add(songToAdd);
    }
    
    public void removeSong(Song songToRemove){
        songs.remove(songToRemove);
    }
    
    public int songCount(){
        return songs.size();
    }
}
