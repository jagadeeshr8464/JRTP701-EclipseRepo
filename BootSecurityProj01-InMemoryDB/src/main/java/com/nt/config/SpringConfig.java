package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//Adding username password and role
		auth.inMemoryAuthentication().withUser("jagadeesh").password("{noop}Hello").roles("Manager");
		auth.inMemoryAuthentication().withUser("ravi").password("{noop}rav123").roles("customer");
		auth.inMemoryAuthentication().withUser("rama").password("{noop}sita").roles("Customer","Manager");
		auth.inMemoryAuthentication().withUser("tarun").password("{noop}thar").roles("Visitor");
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests().antMatchers("/").permitAll() //no authontication and no authorization
		                                                 .antMatchers("/offers").authenticated() // only autjantication
		                                                 .antMatchers("/show_blance").hasAnyRole("Customer","Manager") //authantication+authorization for customer and Manager only
		                                                 .antMatchers("/lone_approve").hasRole("Manager")  //Manager only authanticate and authorized
		                                                 .anyRequest().authenticated()  //remaining all requist urls must be authandicated
		                                                 
		                                                
		                                               //  .and().httpBasic()  // Basic mode of authandication browse generated dialogbox is form username and password
		                                                 
		                                                 .and().formLogin() //enables form mode of authendication
		                                                 .and().logout()
		                                                 //exception or error handling
		                                                 .and().exceptionHandling().accessDeniedPage("/denied");
		                                                 
		
	}
}
