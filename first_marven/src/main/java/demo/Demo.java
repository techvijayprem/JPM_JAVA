
public class Demo {

	public static void main(String[] args) {
		
		
 Fd f1 = new Fd();
 
 f1.setAno(3);
 f1.setAname("test1");
 f1.setBalance(0000);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa1");
		 
		EntityManager entityManager = emf.createEntityManager();

		 entityManager.getTransaction().begin();
		 
		// entityManager.persist(pi);  //saving
		 entityManager.persist(f1);
		 
		 
		 entityManager.getTransaction().commit();
		 


	}

}
