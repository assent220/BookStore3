package com.mycompany.assent.controller;

import com.mycompany.assent.controller.form.Message;
import com.mycompany.assent.controller.util.UrlUtil;
import com.mycompany.assent.domain.Author;
import com.mycompany.assent.service.ServiceAuthor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.inject.Inject;

import static com.mycompany.assent.util.ClassNameUtil.*;
import java.util.List;
import java.util.Locale;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.springframework.context.MessageSource;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author assent2
 */
@RequestMapping("/authors")
@Named
public class Authors {

    final Logger logger = LoggerFactory.getLogger(getCurrentClassName());
    @Inject
    private ServiceAuthor serviceAuthor;
    @Inject
    private MessageSource messageSource;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String all(Model model) {
        logger.info("start: all");

        List<Author> authors = serviceAuthor.getAllAuthor();
        model.addAttribute("authors", authors);

        logger.info("end: Number of authors: " + authors.size());
        return "authors/all";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        logger.info("start: list");
        
        List authors = (List) model.asMap().get("authors");

        logger.info("end: Number of authors: " + authors.size());
        return "authors/list";
    }

//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public String test(Model model) {
//        logger.info("start: test");
//        logger.info("end);");
//        return "admin";
//    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String show(@PathVariable("id") Integer id, Model uiModel) {
        logger.info("start: show");

        Author author = serviceAuthor.getAuthor(id);
        uiModel.addAttribute("author", author);

        logger.info("end");
        return "authors/show";
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String find(Author author, BindingResult bindingResult, Model uiModel,
            HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale) {
        logger.info("start: find " + author);

        if (bindingResult.hasErrors()) {
            Message message = new Message("error",
                    messageSource.getMessage("admin_authors_find_fail", new Object[]{}, locale));
            uiModel.addAttribute("message", message);
            uiModel.addAttribute("author", author);
            logger.info("end");
            return "authors/list";
        }

        uiModel.asMap().clear();

        Message message = new Message("success",
                messageSource.getMessage("admin_authors_find_success", new Object[]{}, locale));
        redirectAttributes.addFlashAttribute("message", message);

        List<Author> listAuthor = serviceAuthor.findAuthor(author);
        redirectAttributes.addFlashAttribute("authors", listAuthor);

        logger.info("end");

        return "redirect:/authors/list";
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public String findForm(Model uiModel) {
        logger.info("start: find");
        uiModel.addAttribute("author", new Author());
        logger.info("end");
        return "authors/find";
    }

    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.POST)
    public String update(Author author, BindingResult bindingResult, Model uiModel,
            HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale) {
        logger.info("start: update author");

        if (bindingResult.hasErrors()) {
            Message message = new Message("error",
                    messageSource.getMessage("admin_authors_update_save_fail", new Object[]{}, locale));
            uiModel.addAttribute("message", message);
            uiModel.addAttribute("author", author);
            logger.info("end");
            return "authors/update";
        }

        uiModel.asMap().clear();

        Message message = new Message("success",
                messageSource.getMessage("admin_authors_update_save_success", new Object[]{}, locale));
        redirectAttributes.addFlashAttribute("message", message);

        serviceAuthor.updateAuthor(author);

        logger.info("end");
        return "redirect:/authors/" + UrlUtil.encodeUrlPathSegment(author.getIdAuthor().toString(),
                httpServletRequest);
    }

    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String updateForm(@PathVariable("id") Integer id, Model uiModel) {
        Author author = serviceAuthor.getAuthor(id);
        uiModel.addAttribute("author", author);
        return "authors/update";
    }

    @RequestMapping(params = "form", method = RequestMethod.POST)
    public String create(Author author, BindingResult bindingResult, Model uiModel,
            HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale) {
        logger.info("start: create author");

        if (bindingResult.hasErrors()) {
            Message message = new Message("error",
                    messageSource.getMessage("admin_authors_update_save_fail", new Object[]{}, locale));
            uiModel.addAttribute("message", message);
            uiModel.addAttribute("author", author);

            logger.info("end");
            return "author/create";
        }
        uiModel.asMap().clear();

        Message message = new Message("success",
                messageSource.getMessage("admin_authors_update_save_success", new Object[]{}, locale));
        redirectAttributes.addFlashAttribute("message", message);
        logger.info("authorId: " + author.getIdAuthor());

        serviceAuthor.createAuthor(author);

        logger.info("end");
        return "redirect:/authors/" + UrlUtil.encodeUrlPathSegment(author.getIdAuthor().toString(),
                httpServletRequest);
    }

    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String createForm(Model uiModel) {
        Author author = new Author();
        uiModel.addAttribute("author", author);
        return "authors/create";
    }
}
