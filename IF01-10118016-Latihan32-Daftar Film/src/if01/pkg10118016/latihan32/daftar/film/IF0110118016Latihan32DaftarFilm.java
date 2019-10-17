/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan32.daftar.film;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Daftar Film
 */
public class IF0110118016Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film film = new Film();
       
       //output
        System.out.println("======Daftar Film Sedang Tayang======\n");
        
        //venom
        film.filmName = "Venom";
        film.filmGenre = "Action, Horor, SciFi";
        film.filmRating = 8.5;
        film.filmDuration = 120;
        film.nowPlaying();
        
        //Small Foot
        film.filmName = "Small Foot";
        film.filmGenre = "Animation";
        film.filmRating = 9.0;
        film.filmDuration = 96;
        film.nowPlaying();
        
        //Crazy Rich Asian
        film.filmName = "Crazy Rich Asian";
        film.filmGenre = "Comedy";
        film.filmRating = 7.8;
        film.filmDuration = 119;
        film.nowPlaying();
        
        //Asih
        film.filmName = "Asih";
        film.filmGenre = "Horor";
        film.filmRating = 6.0;
        film.filmDuration = 100;
        film.nowPlaying();
    }
    
}
