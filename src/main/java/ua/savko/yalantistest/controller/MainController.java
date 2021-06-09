package ua.savko.yalantistest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ua.savko.yalantistest.model.Member;
import ua.savko.yalantistest.service.MemberService;

import java.util.Date;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    MemberService memberService;

    private boolean userExistWithEmail;

    @GetMapping("/")
    public String index(Model model) {
        List<Member> listOfMembers = memberService.getMembers();
        model.addAttribute("members", listOfMembers);
        model.addAttribute("error", userExistWithEmail);
        model.addAttribute("member", new Member());
        return "index";
    }

    @PostMapping("/new-member")
    public String addMember(@ModelAttribute("member") Member member) {
        member.setRegistrationDate(new Date());
        userExistWithEmail = memberService.isUserExistWithEmail(member.getEmail());
        if(!userExistWithEmail) {
            memberService.addMember(member);
        }
        return "redirect:/";
    }
}
