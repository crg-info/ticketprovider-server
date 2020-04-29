/*package com.crg.queries;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.domain.Pageable;


public interface Dao {

	
	method query:
		
        List<Entity> findEntityByEmail(String email);
		
	named query:
	
		 List<Entity> findEntityByEmail(String email);	

         List<Entity> findEntityByUsernameAndFirstname(String username,String firstname);
         
         List<Entity> findAdminsBySysAdminId(int id);
         
         List<Entity> findUsersByAdminId(int id);
         
         List<Entity> findUsersByBusId(int id);
         
         List<Entity> findBussessByAdminId(int id);
         
         List<Entity> findBussessByTravel  Id(int id);
         
         List<Entity> findBusByBusId(int id);
         
         List<Entity> findEntityById(int id);
		
     named native query:
        		
          List<Entity> findEntityByEmail(String email);	

          List<Entity> findEntityByUsernameAndFirstname(String username,String firstname); 
          
     @Query(namedquery):
    	 
    	 @Query("SELECT u FROM User u WHERE u.email=?1")
          List<Entity> findEntityByEmail(String email);	
     @Query("SELECT u FROM User u WHERE u.username=?1 AND u.firstname=?2")
          List<Entity> findEntityByUsernameAndFirstname(String username,String firstname); 
     
 @Query(namednativequery):
    	 
    	 @Query("SELECT * FROM User WHERE email=?1")
          List<Entity> findEntityByEmail(String email);	
     @Query("SELECT * FROM User WHERE username=?1 AND firstname=?2")
          List<Entity> findEntityByUsernameAndFirstname(String username,String firstname); 
}

Pageable:
	
	 List<Entity> findEntityByEmail(String email, Pageable pageable);	

UsedNamedParameters:
	
	 @Query("SELECT u FROM User u WHERE u.username= :username or u.firstname= :firstname")
List<Entity> findEntityByUsernameAndFirstname(@Param("username") String username,@Param("firstname")String firstname);*/