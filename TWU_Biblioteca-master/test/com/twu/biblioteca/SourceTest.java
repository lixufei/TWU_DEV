package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Lily on 2015/6/7.
 */
public class SourceTest {

    @Test
    public void check_booklst(){
        assertThat(null,not(equalTo(new Source().lstBooks())));
    }

    @Test
    public void check_out_book(){
        assertThat(true,equalTo(new Source().checkOutBook("book_1")));
    }

    @Test
    public void return_book(){
        assertThat(true,equalTo(new Source().returnBook("book_1")));
    }

    @Test
    public void check_out_movie(){
        assertThat(true,equalTo(new Source().checkOutMovie("movie_1")));
    }
}
