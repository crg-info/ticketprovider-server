/*package com.crg.queries;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;




public class Service {

	@Autowired 
	private Dao dao;

	
	method query:
		
	public static List<Entity> findEntityByEmail(String email) {
		
		return dao.findEntityByEmail(email);
	}
	
	named query:
	
     public static List<Entity> findEntityByEmail(String email) {
		
		return dao.findEntityByEmail(email);
	}

	public static List<Entity> findEntityByUsernameAndFirstname(String username,String firstname) {
		
		return dao.findEntityByUsernameAndFirstname(username,firstname);;
	}
    public static List<Entity> findAdminsBSysAdminId(int id) {
		
		return dao.findAdminsBSysAdminId(id);
	}
	public static List<Entity> findUsersByAdminId(int id) {
		
		return dao.findUsersByAdminId(id);
	}
	 public static List<Entity> findUsersByBusId(int id) {
			
			return dao.findUsersByBusId(id);
		}
	 public static List<Entity> findBussesByAdminId(int 1001) {
			
			return dao.findBussesByAdminId(id);
		}
	 public static List<Entity> findBussesByTravelId(int 1001) {
			
			return dao.findBussesByTravelId(id);
		}
	 
	 public static List<Entity> findBusByBusId(int id) {
			
			return dao.findBusByBusId(id);
	 }
	 public static List<Entity> findEntityById(int id) {
			
			return dao.findEntityById(id);
		}
	
	named native query:
		
	     public static List<Entity> findEntityByEmail(String email) {
			
			return dao.findEntityByEmail(email);
		}

		public static List<Entity> findEntityByUsernameAndFirstname(String username,String firstname) {
			
			return dao.findEntityByUsernameAndFirstname(username,firstname);;
		}
		
		@Query(namedquery):
			
		     public static List<Entity> findEntityByEmail(String email) {
				
				return dao.findEntityByEmail(email);
			}

			public static List<Entity> findEntityByUsernameAndFirstname(String username,String firstname) {
				
				return dao.findEntityByUsernameAndFirstname(username,firstname);;
			}
			@Query(namednativequery):
				
			     public static List<Entity> findEntityByEmail(String email) {
					
					return dao.findEntityByEmail(email);
				}

				public static List<Entity> findEntityByUsernameAndFirstname(String username,String firstname) {
					
					return dao.findEntityByUsernameAndFirstname(username,firstname);;
				}
				
	  Pageable:
		  
 public static List<Entity> findEntityByEmail(String email, PageRequest pagerequest) {
					
					return dao.findEntityByEmail(email);
				}

	 UsedNamedParameters:
					 
public static List<Entity> findEntityByUsernameOrFirstname(String username,String firstname) {
					
					return dao.findEntityByUsernameOrFirstname(username,firstname);;
				}
}*/
