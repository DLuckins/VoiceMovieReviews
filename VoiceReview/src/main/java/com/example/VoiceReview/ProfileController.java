package com.example.VoiceReview;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    public String show(){
        return "Profile";
    }
}
