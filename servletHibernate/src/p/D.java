package p;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class D
{
  public boolean saveDetails(String username)
{
    boolean flag=true;
    SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Session session=factory.openSession();
       
      users u=new users();
        
       u.setUsername(username);
        
      Transaction transaction=session.beginTransaction();
      try
      {
          session.save(u);
          transaction.commit();
      }catch(Exception e)
      {
          transaction.rollback();
          flag=false;
           
      }
      session.close();
      return flag;
      }
}