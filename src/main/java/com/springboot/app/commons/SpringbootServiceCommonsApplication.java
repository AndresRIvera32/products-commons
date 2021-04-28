package com.springboot.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//the goal is to gather all the commons library under the same domain if they are related among projects
//it could be achieved using domain driven design
//http://static.olivergierke.de/lectures/ddd-and-spring/
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootServiceCommonsApplication {

}
