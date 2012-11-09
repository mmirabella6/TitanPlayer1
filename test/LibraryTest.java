/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import music.Song;
import music.Library;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class LibraryTest {
    
    public LibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void emptyLibrary(){
        Library emptyLibrary = new Library();
        assertEquals(0, emptyLibrary.songCount());
    }
    
    @Test
    public void addSongTest(){
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("Nas is Like", "Nas"));
        myLibrary.addSong(new Song("Cant't Knock the Hustle", "Jay-Z"));
        assertEquals(2, myLibrary.songCount());
    }
    
    @Test
    public void removeSongTest(){
        Library myLibrary = new Library();
        myLibrary.removeSong(new Song("Nas is Like", "Nas"));
        myLibrary.removeSong(new Song("Can't Knock the Hustle", "Jay-Z"));
        assertEquals(0, myLibrary.songCount());
    }
}
