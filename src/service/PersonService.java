package service;
 

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface PersonService {

	@WebMethod
	public boolean addPerson(Person p); 
	
	@WebMethod
	public boolean deletePerson(int id); 
	
	@WebMethod
	public Person getPerson(int id); 
	
	@WebMethod
	public Person[] getAllPerson(); 
}
