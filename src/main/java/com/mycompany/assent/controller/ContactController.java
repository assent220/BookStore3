/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assent.controller;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author assent2
 */
@RequestMapping("/contacts")
@Named
public class ContactController {

//    final Logger logger = LoggerFactory.getLogger(ContactController.class);
//    @Inject
//    private ContactService contactService;
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String list(Model uiModel) {
//        logger.info("Listing contacts");
//        List<Contact> contacts = contactService.findAll();
//        uiModel.addAttribute("contacts", contacts);
//        logger.info("No. of contacts: " + contacts.size());
//        return "contacts/list";
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public String show(@PathVariable("id") Long id, Model uiModel) {
//        Contact contact = contactService.findById(id);
//        uiModel.addAttribute("contact", contact);
//        return "contacts/show";
//    }
//    @Autowired
//    MessageSource messageSource;
//
//    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.POST)
//    public String update(Contact contact, BindingResult bindingResult, Model uiModel,
//            HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale) {
//        logger.info("Updating contact");
//        if (bindingResult.hasErrors()) {
//            uiModel.addAttribute("message", new Message("error",
//                    messageSource.getMessage("contact_save_fail", new Object[]{}, locale)));
//            uiModel.addAttribute("contact", contact);
//            return "contacts/update";
//        }
//        uiModel.asMap().clear();
//        redirectAttributes.addFlashAttribute("message", new Message("success",
//                messageSource.getMessage("contact_save_success", new Object[]{}, locale)));
//        contactService.save(contact);
//        return "redirect:/contacts/" + UrlUtil.encodeUrlPathSegment(contact.getId().toString(),
//                httpServletRequest);
//    }
//
//    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
//    public String updateForm(@PathVariable("id") Long id, Model uiModel) {
//        uiModel.addAttribute("contact", contactService.findById(id));
//        return "contacts/update";
//    }
//
//    @RequestMapping(params = "form", method = RequestMethod.POST)
//    public String create(Contact contact, BindingResult bindingResult, Model uiModel,
//            HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale) {
//        logger.info("Creating contact");
//        if (bindingResult.hasErrors()) {
//            uiModel.addAttribute("message", new Message("error",
//                    messageSource.getMessage("contact_save_fail", new Object[]{}, locale)));
//            uiModel.addAttribute("contact", contact);
//            return "contacts/create";
//        }
//        uiModel.asMap().clear();
//        redirectAttributes.addFlashAttribute("message", new Message("success",
//                messageSource.getMessage("contact_save_success", new Object[]{}, locale)));
//        logger.info("Contact id: " + contact.getId());
//        contactService.save(contact);
//        return "redirect:/contacts/" + UrlUtil.encodeUrlPathSegment(contact.getId().toString(),
//                httpServletRequest);
//    }
//
//    @RequestMapping(params = "form", method = RequestMethod.GET)
//    public String createForm(Model uiModel) {
//        Contact contact = new Contact();
//        uiModel.addAttribute("contact", contact);
//        return "contacts/create";
//    }
}