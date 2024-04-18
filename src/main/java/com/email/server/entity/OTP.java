package com.email.server.entity;

import lombok.Data;

@Data
public class OTP
{

    private String otp;

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
