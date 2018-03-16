package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import web.forms.CustomerForm;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping(value = "/forms") //начальный путь по умолчанию
@SessionAttributes(types = CustomerForm.class)
public class CustomerController {
    
    private Logger logger;
    
    @PostConstruct
    private void initialize(){
        logger = LoggerFactory.getLogger(CustomerController.class);
    }
    
    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String customer(Model model){
        model.addAttribute(new CustomerForm());
        return "customer";
    }
    
    @RequestMapping(value = "/account", method = RequestMethod.POST)
    private String account(CustomerForm customerForm, SessionStatus status){
        logger.info("Name     : " + customerForm.getName());
        logger.info("Surame   : " + customerForm.getSurname());
        logger.info("Age      : " + customerForm.getAge());
        logger.info("Login    : " + customerForm.getLogin());
        logger.info("Password : " + customerForm.getPassword());
        logger.info("Credit   : " + customerForm.getCredit());
        logger.info("\nSession status : " + status.isComplete());
        return "account";
    }
    
    @RequestMapping(value = "/credit", method = RequestMethod.POST)
    private String credit(CustomerForm customerForm, SessionStatus status) {
        logger.info("Name     : " + customerForm.getName());
        logger.info("Surame   : " + customerForm.getSurname());
        logger.info("Age      : " + customerForm.getAge());
        logger.info("Login    : " + customerForm.getLogin());
        logger.info("Password : " + customerForm.getPassword());
        logger.info("Credit   : " + customerForm.getCredit());
        logger.info("\nSession status : " + status.isComplete());
        return "account";
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    private String confirm(CustomerForm customerForm, SessionStatus status){
        logger.info("Name     : " + customerForm.getName());
        logger.info("Surame   : " + customerForm.getSurname());
        logger.info("Age      : " + customerForm.getAge());
        logger.info("Login    : " + customerForm.getLogin());
        logger.info("Password : " + customerForm.getPassword());
        logger.info("Credit   : " + customerForm.getCredit());
        logger.info("\nSession status : " + status.isComplete());
        return "redirect:/congrats";
    }

    @RequestMapping(value = "/congrats", method = RequestMethod.POST)
    private String congrats(SessionStatus status){
        status.setComplete();
        return "confirm";
    }
}
