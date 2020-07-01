package com.eureka.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SpringbootWithHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithHibernateApplication.class, args);
	}

	/*
	 * @Autowired private UserRepositry userRepositry;
	 * 
	 * @Autowired private UserProfileRepositry userProfileRepositry;
	 * 
	 * @Override public void run(String... args) throws Exception { User user = new
	 * User(); user.setName("vikash"); user.setEmail("singh.vikash630@gmail.com");
	 * 
	 * UserProfile userProfile = new UserProfile(); userProfile.setAddress("Delhi");
	 * userProfile.setGender(Gender.MALE); userProfile.setPhoneNumber("9015762011");
	 * userProfile.setDateOfBirth(new Date()); user.setUserProfile(userProfile);
	 * userProfile.setUser(user);
	 * 
	 * userRepositry.save(user); userProfileRepositry.save(userProfile);
	 * 
	 * }
	 */

}
