import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Prueba {
	
	private static SessionFactory sessionFactory = null;
	
	public static void main(String[] args){
		// TODO No funciona :(

		Scanner teclado=new Scanner(System.in);
		Session session = null;
        try {
            try {
                sessionFactory = SorteosFactory.getSessionFactory();
                session = sessionFactory.openSession();
 
                System.out.println("Insertando registro");
                Transaction tx = session.beginTransaction();
                Date fecha=new Date();
                
                Sorteos miSorteo=new Sorteos(69,fecha);
        		System.out.println("Sorteo con id: "+miSorteo.getIdSorteo());
        		System.out.println("Reintegro del Sorteo: "+miSorteo.getRein());
        		System.out.println("Intoduce un nuevo reintegro");
                session.save(miSorteo);

                tx.commit();
                
                tx=session.beginTransaction();
        		miSorteo.setRein(teclado.nextByte());
        		System.out.println("Vete al ssms");
        		tx.commit();
        		
                System.out.println("Finalizado...");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } finally {
            session.close();
        }

	}
}
