package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lily on 2015/6/7.
 */
public class Source {

    public static void userFrame(){
        System.out.println("------------------");
        System.out.println("1.Main Menu");
        System.out.println("2.Details");
        System.out.println("3.CheckOut Books");
        System.out.println("4.Return Books");
        System.out.println("5.CheckOut Movies");
        System.out.println("6.Quit");
        System.out.println("------------------");
    }

    public static void operations(int num){
        switch (num){
            case 1:
                System.out.println("------------------");
                System.out.println("1.List Books");
                System.out.println("2.List Movies");
                System.out.println("------------------");
                Scanner aOru = new Scanner(System.in);
                int choice = aOru.nextInt();
                if (choice == 1){
                    for (int i = 0;i < lstBooks().size();i++){
                        System.out.println(lstBooks().get(i).getBookName());
                    }
                }else if (choice == 2){
                    for (int i = 0;i < lstBooks().size();i++){
                        System.out.println(lstBooks().get(i).getBookName());
                    };
                }
                break;
            case 2:
                System.out.println("Please input the book name or movie name:");
                Scanner sd = new Scanner(System.in);
                show_details(sd.next());
                break;
            case 3:
                System.out.println("Please input the book name you will check out:");
                Scanner sc = new Scanner(System.in);
                checkOutBook(sc.next());
                break;
            case 4:
                System.out.println("Please input the book name you will return:");
                Scanner sa = new Scanner(System.in);
                returnBook(sa.next());
                break;
            case 5:
                System.out.println("Please input the book name you will return:");
                Scanner sb = new Scanner(System.in);
                checkOutMovie(sb.next());
                break;
            case 6:
                System.out.println("Thanks for your visiting!");
                break;
            default:
                System.out.println("your input is not correct!");
                break;
        }
    }

    public static boolean checkOutMovie(String movieName){
        for (int i = 0;i < movielst().size();i++){
            if (movieName.equals(movielst().get(i).getMovieName())){
                System.out.println("Thank you! Enjoy the movie");
                return true;
            }else {
                System.out.println("It's not a variable movie");
                return false;
            }
        }
        return false;
    }

    public static boolean returnBook(String bookName){
        for (int i = 0;i < lstBooks().size();i++){
            if (bookName.equals(lstBooks().get(i).getBookName())){
                System.out.println("Thank you for returning the book.");
                return true;
            }else {
                System.out.println("That is not a valid book to return.");
                return false;
            }
        }
        return false;
    }
    public static boolean checkOutBook(String bookName){
        for (int i = 0;i < lstBooks().size();i++){
            if (bookName.equals(lstBooks().get(i).getBookName())){
                System.out.println("Thank you! Enjoy the book");
                return true;
            }else {
                System.out.println("That book is not available.");
                return false;
            }
        }
        return false;
    }

    public static List<Book> lstBooks(){
        List<Book> bookslst = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setBookName("book_1");
        book1.setAuthor("author_1");
        book1.setYearPublished("yearPublished_1");
        bookslst.add(book1);

        Book book2 = new Book();
        book2.setBookName("book_2");
        book2.setAuthor("author_2");
        book2.setYearPublished("yearPublished_2");
        bookslst.add(book2);

        Book book3 = new Book();
        book3.setBookName("book_3");
        book3.setAuthor("author_3");
        book3.setYearPublished("yearPublished_3");

        bookslst.add(book3);

        return bookslst;
    }

    public static List<Movies> movielst(){
        List<Movies> movieslst = new ArrayList<Movies>();
        Movies movies1 = new Movies();
        movies1.setMovieName("movie_1");
        movies1.setMovieYear("year_1");
        movies1.setDerector("director_1");
        movies1.setRating("rating_1");
        movieslst.add(movies1);

        Movies movies2 = new Movies();
        movies2.setMovieName("movie_2");
        movies2.setMovieYear("year_2");
        movies2.setDerector("director_2");
        movies2.setRating("rating_2");
        movieslst.add(movies2);

        Movies movies3 = new Movies();
        movies3.setMovieName("movie_3");
        movies3.setMovieYear("year_3");
        movies3.setDerector("director_3");
        movies3.setRating("rating_3");

        movieslst.add(movies3);

        return movieslst;
    }

    public static void show_details(String name){
        for (int i = 0;i < lstBooks().size();i++){
            if (name.equals(lstBooks().get(i).getBookName())){
                System.out.println("Author:" + lstBooks().get(i).getAuthor());
                System.out.println("YearPublished:" + lstBooks().get(i).getYearPublished());
            }
        }

        for (int j = 0;j < movielst().size();j++){
            if (name.equals(movielst().get(j).getMovieName())){
                System.out.println("Year:" + movielst().get(j).getMovieYear());
                System.out.println("Director:" + movielst().get(j).getDirector());
                System.out.println("Rating:" + movielst().get(j).getRating());
            }
        }
    }
}
