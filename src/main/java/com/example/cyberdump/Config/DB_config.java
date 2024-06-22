package com.example.cyberdump.Config;

import com.example.cyberdump.Repository.ToonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DB_config {

    @Service
    public static class DBdetails {

        @Autowired
        ToonsRepository toonsRepository;

//        @Override
//        public Toons loadUserByHandle(String username) throws HandleNotFoundException {
//            String userName, password = null;
//            List<GrantedAuthority> authorities = null;
//            UserInfo userInfo = userInfoRepository.findByUsername(username);
//            if(userInfo != null) {
//                userName = userInfo.getUsername();
//                password = userInfo.getPassword();
//                authorities = new ArrayList<>();
//                authorities.add(new SimpleGrantedAuthority(userInfo.getRole()));
//                return new User(username, password, authorities);
//            }
//            else{
//                throw new UsernameNotFoundException("User not found");
//            }

            //}





    }
}
