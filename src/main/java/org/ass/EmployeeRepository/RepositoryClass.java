package org.ass.EmployeeRepository;

import java.util.List;

import org.ass.EmployeeEntity.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RepositoryClass {
	 @Autowired
	 private SessionFactory sessionFactory;
	 
	public void SaveObject(Employee employee) {
		  Session session=sessionFactory.openSession();
		  Transaction transaction=session.beginTransaction();
		  session.save(employee);
		  transaction.commit();
		
	
		
     }
	public List<Employee> getAllData(){
		   Session ss=sessionFactory.openSession();
		   String hql="from Employee";
		    Query<Employee>q=ss.createQuery(hql);
		    
		    return q.getResultList();
	}
}
