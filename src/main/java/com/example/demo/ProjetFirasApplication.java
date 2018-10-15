package com.example.demo;

import com.example.demo.Controller.UserController;
import com.example.demo.Entities.EmailMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

@SpringBootApplication
public class ProjetFirasApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetFirasApplication.class, args);

    }

}
