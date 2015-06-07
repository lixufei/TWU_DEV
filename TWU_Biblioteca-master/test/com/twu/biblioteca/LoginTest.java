package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

/**
 * Created by Lily on 2015/6/7.
 */
public class LoginTest {
    @Test
    public void check_user_login(){
        assertThat(true, equalTo(new Login().userLogin("000","000")));
    }

    @Test
    public void check_admin_login(){
        assertThat(true, equalTo(new Login().adminLogin("admin","admin")));
    }
}
