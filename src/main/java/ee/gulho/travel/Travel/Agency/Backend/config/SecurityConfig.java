package ee.gulho.travel.Travel.Agency.Backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;*/

import javax.sql.DataSource;

/*@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)*/
public class SecurityConfig/* extends WebSecurityConfigurerAdapter*/ {
 /*   @Autowired
    private DataSource dataSource;

    @Autowired
//    private MyUserService myUserService;
    private UserDetailsService userDetailsService;
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        *//*auth.inMemoryAuthentication().withUser("gulho").password("123456").roles("USER")
                .and().withUser("gulho2").password("123456").roles("ADMIN");*//*
//       auth.jdbcAuthentication().dataSource(dataSource);
//        auth.userDetailsService(myUserService);
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
*//*        http.authorizeRequests()
                .antMatchers("/web/city/**").hasRole("USER")
                .antMatchers("/web/country/**").permitAll()
                .and().formLogin();*//*
*//*        http.cors().and().csrf().disable().authorizeRequests()
                .anyRequest().authenticated().and().formLogin()
                .loginPage("/web/login").permitAll().permitAll()
                .usernameParameter("userId").passwordParameter("passCode");*//*
        http.cors().and().cors().disable()
                .authorizeRequests()
                .antMatchers("/travel/**").permitAll()
                .antMatchers("/user/**").permitAll()
                .antMatchers("/manage/**").hasRole("MANAGER")
                .and().formLogin();
    }*/
}
