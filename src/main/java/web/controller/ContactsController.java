package web.controller;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import web.dao.ContactsDAO;
import web.entity.Contact;

import java.util.List;

@Controller
public class ContactsController {

    private static final String URL_NEW_CONTACT = "/new_contact";
    private static final String URL_GET_CONTACTS = "/get_contacts";


    private static final String PARAM_NAME = "name";
    private static final String PARAM_SURNAME = "surname";
    private static final String PARAM_EMAIL = "email";
    private static final String PARAM_PHONE = "phone";

    @Autowired
    private ContactsDAO contactsDAO;

    @RequestMapping(value = URL_NEW_CONTACT, method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.OK) 200
    @ResponseStatus(HttpStatus.CREATED) /*201*/
    public void newContact(
            @RequestParam(value = PARAM_NAME)       String name,
            @RequestParam(value = PARAM_SURNAME)    String surname,
            @RequestParam(value = PARAM_EMAIL)      String email,
            @RequestParam(value = PARAM_PHONE)      String phone){
        contactsDAO.create(name, surname, email, phone);
//        return "redirect:/contacts";
    }

    @RequestMapping(value = URL_GET_CONTACTS, method = RequestMethod.GET)
    public @ResponseBody String getContacts(){
        List<Contact> contacts = contactsDAO.getAll();
        JSONArray array = new JSONArray(contacts);
        return array.toString();
    }

}
