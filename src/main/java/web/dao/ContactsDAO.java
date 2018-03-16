package web.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.entity.Contact;

import java.util.List;
import java.util.logging.LogManager;

@Repository
@Transactional
public class ContactsDAO {

    private Logger log = LoggerFactory.getLogger(ContactsDAO.class);

    @Autowired
    private SessionFactory factory;

    public void create(String name,
                       String surname,
                       String email,
                       String phone){
        log.info("Checking parameters... [" +
        name + ", " + surname + ", " + phone + ", " + email + "]");
        Contact contact = new Contact(name, surname, email, phone);
        log.info("Create class Contact - [" + contact + "]");
        try {
            factory.getCurrentSession().saveOrUpdate(contact);
            log.info("New Contact CREATE");
        }catch (HibernateException e){
            e.printStackTrace();
            log.info("New Contact FAIL.");
        }

    }

    public List<Contact> getAll(){

        return factory
                .getCurrentSession()
                .createCriteria(Contact.class)
                .list();
    }
}
