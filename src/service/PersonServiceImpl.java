package service;
 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.jws.WebService;

@WebService(endpointInterface = "service.PersonService")
public class PersonServiceImpl implements PersonService {

	private static Map<Integer, Person> map = new HashMap<>();
	
	@Override
	public boolean addPerson(Person p) {
		map.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean deletePerson(int id) {
		map.remove(id);
		return true;
	}

	@Override
	public Person getPerson(int id) {
		return map.get(id);
	}

	@Override
	public Person[] getAllPerson() {
		Set<Integer> personIds = map.keySet();
		Person[] persons = new Person[personIds.size()];
		Iterator<Integer> iterator = personIds.iterator();
		int i = 0;
		while(iterator.hasNext()) {
			persons[i] = map.get(iterator.next());
			i++;
			System.out.println("asdf");
		}
	 	return persons;
	}
}
