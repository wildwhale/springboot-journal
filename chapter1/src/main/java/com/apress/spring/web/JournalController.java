package com.apress.spring.web;

import com.apress.spring.domain.Journal;
import com.apress.spring.domain.JournalEntry;
import com.apress.spring.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JournalController {

    @Autowired
    JournalRepository repo;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("journal", repo.findAll());
        return "index";
    }

    @RequestMapping(value = "/journal", produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody List<JournalEntry> getJournal() {
        return repo.findAll();
    }
}
