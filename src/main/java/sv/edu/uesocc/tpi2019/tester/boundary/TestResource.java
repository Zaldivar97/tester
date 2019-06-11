/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.tpi2019.tester.boundary;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.tpi2019.tester.entity.Person;

/**
 *
 * @author zaldivar
 */
@Path("/test")        
public class TestResource {
    
 private final List<Person> model=Arrays.asList(new Person("Steven", "Zaldivar", 22),
                                                new Person("Christian", "Herrera", 18));
    
 @GET
 @Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
 public List<Person> findall(){
     return this.model;
 } 
 
}
