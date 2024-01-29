package com.example.VoiceReview;

public class LoginService {
    public boolean tryLogin(User user){
        for (User storedUser:
             UserDB.users) {
                if(storedUser.getUsername().equals(user.getUsername()) &&
                        storedUser.getPassword().equals(user.getPassword())){
                    return true;
                }
        }
        return false;
    }
}
