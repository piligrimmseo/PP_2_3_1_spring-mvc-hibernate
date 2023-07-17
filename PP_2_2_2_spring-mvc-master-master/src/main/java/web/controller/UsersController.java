package web.controller;

import dao.UserDAO;
import dao.UserDAOImp;
import Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController {

    UserDAO userDAOImp = new UserDAOImp();


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", userDAOImp.index());
        return "users";
    }

    @GetMapping("/{id}")
    public String show (@PathVariable("id") int id, Model model) {
        model.addAttribute("userId", userDAOImp.show(id));
                return "id";
    }

    @GetMapping("/new")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping
    public String create(@ModelAttribute("user") User user) {
        userDAOImp.save(user);
        return "redirect:/";
    }


    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userDAOImp.show(id));
        return "/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") User user, @PathVariable("id") int id){
        userDAOImp.update(id, user);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String delete (@PathVariable("id") int id){
        userDAOImp.delete(id);
        return "redirect:/";
    }



}
