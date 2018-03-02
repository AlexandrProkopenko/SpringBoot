package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.entity.Contact;

import java.util.List;

@Repository
@Transactional
public class ContactsDAO {

    @Autowired
    private SessionFactory factory;

    public void create(String name,
                       String surname,
                       String email,
                       String phone){
        Contact contact = new Contact(name, surname, email, phone);
        factory.getCurrentSession().saveOrUpdate(contact);
    }

    public List<Contact> getAll(){

        return factory
                .getCurrentSession()
                .createCriteria(Contact.class)
                .list();
    }
}
