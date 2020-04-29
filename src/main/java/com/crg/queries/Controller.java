/*package com.crg.queries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

public class Controller {

	    @Autowired
		private Service service;
		
   MethodQuery:
	    	
		private List<Entity> findEntityByEmail() {
		List<Entity> entityList=Service.findEntityByEmail("boravijaykumar595@gmail.com") ;
		return entityList;
	}


   NamedQuery:
	   
	   private List<Entity> findEntityByEmail() {
		List<Entity> entityList=Service.findEntityByEmail("boravijaykumar595@gmail.com") ;
		return entityList;   
	}
		 private List<Entity> findEntityByUsernameAndFirstname() {
		  List<Entity> entityList=Service.findEntityByUsernameAndFirstname("vijay","vijju") ;
		  return entityList;   
	   }
		 private List<Entity> findAdminsBySysAdminId() {
				List<Entity> entityList=Service.findAdminsBySysAdminId("1001") ;
				return entityList;
		 }
		 private List<Entity> findUsersByAdminId() {
				List<Entity> entityList=Service.findUsersById("1001") ;
				return entityList;
		 }
		 private List<Entity> findUsersByBusId() {
				List<Entity> entityList=Service.findUsersByBusId("1001") ;
				return entityList;
		 }
		 private List<Entity> findBussesByAdminId() {
				List<Entity> entityList=Service.findBussesByAdminId("1001") ;
				return entityList;
		 } 
		 private List<Entity> findBussesByTravelId() {
				List<Entity> entityList=Service.findBussesByTravelId("1001") ;
				return entityList;
		 }
		 private List<Entity> findBusByBusId() {
				List<Entity> entityList=Service.findBusByBusId("1001") ;
				return entityList;
		 }
		 private List<Entity> findEntityById() {
				List<Entity> entityList=Service.findEntityByEmail("101") ;
				return entityList;   
			}
				
NamedNativeQuery:
			   
	    private List<Entity> findEntityByEmail() {
		 List<Entity> entityList=Service.findEntityByEmail("boravijaykumar595@gmail.com") ;
		 return entityList;   
				
		 private List<Entity> findEntityByUsernameAndFirstname() {
		  List<Entity> entityList=Service.findEntityByUsernameAndFirstname("vijay","vijju") ;
		 return entityList;   
			   
		}	
		 
		 @Query(namedQuery):
			   
			   private List<Entity> findEntityByEmail() {
				List<Entity> entityList=Service.findEntityByEmail("boravijaykumar595@gmail.com") ;
				return entityList;   
				
				 private List<Entity> findEntityByUsernameAndFirstname() {
				  List<Entity> entityList=Service.findEntityByUsernameAndFirstname("vijay","vijju") ;
				  return entityList;   
			   
		}	 	
				 @Query(namedNativeQuery):
					   
					   private List<Entity> findEntityByEmail() {
						List<Entity> entityList=Service.findEntityByEmail("boravijaykumar595@gmail.com") ;
						return entityList;   
						
						 private List<Entity> findEntityByUsernameAndFirstname() {
						  List<Entity> entityList=Service.findEntityByUsernameAndFirstname("vijay","vijju") ;
						  return entityList;   
					   }	 
			
		Pageable:
			
			 private List<Entity> findEntityByEmail() {
			List<Entity> entityList=Service.findEntityByEmail("boravijaykumar595@gmail.com") ;
			new PageRequest (0,2(firstTwoRecords),DirectionASC, "email");
			
			return entityList; 
				
				}
				
	 UsedNamedParameters:
		 
		 private List<Entity> findEntityByUsernameOrFirstname() {
		  List<Entity> entityList=Service.findEntityByUsernameOrFirstname("vijay","vijju") ;
		  return entityList;   
	   }
		 
				 }*/