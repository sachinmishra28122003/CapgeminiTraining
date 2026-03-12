package com.galgotias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class UserVerifier {
    // asking spring to  inject in it so that we don't need to make things
//    @Autowired
//    OtpGenerator otp ;

    @Autowired
    OtpGenerator fourDigitOtpGenerator;

    @Autowired
    OtpGenerator sixDigitOtpGenerator;

//    @Autowired
//    public UserVerifier(OtpGenerator otp) {
//        super();
//        this.otp = otp;
//    }
    public void verifyUser() {
        String o = fourDigitOtpGenerator.getOtp();
        if(o != null) {
            System.out.println("User Verified");
        }
        else {
            System.out.println("User Not Verified");
        }
//        System.out.println(otp.getClass());
        System.out.println(fourDigitOtpGenerator.getClass());
        System.out.println(sixDigitOtpGenerator.getClass());

    }
}
