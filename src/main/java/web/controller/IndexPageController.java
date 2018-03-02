package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexPageController {

    private static final String HEAD_URL = "/";
    private static final String CONTACTS_URL = "/contacts";


    @RequestMapping(HEAD_URL)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/dash", method = RequestMethod.GET)
    public String dash() {
        return "dashboard";
    }

    @RequestMapping(value = "/calc", method = RequestMethod.GET)
    public String calc() {
        return "calculator";
    }

    @RequestMapping(value = CONTACTS_URL, method = RequestMethod.GET)
    public String contacts() {
        return "contacts";
    }



}
