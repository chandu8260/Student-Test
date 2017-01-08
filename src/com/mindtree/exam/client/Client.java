/**
 * 
 */


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mindtree.exam.entity.Student;
import com.sun.jmx.trace.Trace;

/**
 * @author M1018161
 * 
 */
public class Client {
	public static void main(String[] args) {
		SessionFactory sessionf = new Configuration().configure().buildSessionFactory();
		Session session = sessionf.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			Student student = new Student();
			student.setRegistrationNumber(1);
			student.setStudentName("AAA");
			student.setAddress("thiruvanmkituer");
			student.setPhoneNumber(1234567890);
			session.save(student);

			student = new Student();
			student.setRegistrationNumber(2);
			student.setStudentName("BBB");
			student.setAddress("guindy");
			student.setPhoneNumber(1234567899);
			session.save(student);

			student = new Student();
			student.setRegistrationNumber(3);
			student.setStudentName("CCC");
			student.setAddress("chennai");
			student.setPhoneNumber(1234567897);
			session.save(student);

			transaction.commit();
			session.close();

		} catch (Exception exception) {

			transaction.rollback();
			session.close();
		}
	}

}
