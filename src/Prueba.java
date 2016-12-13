import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Boletos;
import model.Sorteos;

public class Prueba {
	
	private static SessionFactory sessionFactory = null;
	
	public static void main(String[] args){
		// TODO No funciona :(
		
		Session session = null;
        try {
            try {
                sessionFactory = SorteosFactory.getSessionFactory();
                session = sessionFactory.openSession();
 
                System.out.println("Insertando registro");
                Transaction tx = session.beginTransaction();
                Date fecha=new Date(2018, 5, 15);
                Sorteos miSorteo=new Sorteos(10,fecha);
        		System.out.println("Sorteo con id: "+miSorteo.getIdSorteo());
        		System.out.println("Reintegro del Sorteo: "+miSorteo.getRein());
        		System.out.println("Intoduce un nuevo reintegro");
        		Scanner teclado=new Scanner(System.in);
        		System.out.println("Vete al ssms");
                session.save(miSorteo);
        		miSorteo.setRein(teclado.nextByte());
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
