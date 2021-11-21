package br.com.gen.hellomessage.service.impl;

import br.com.gen.hellomessage.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello() {
        return "Hello World!";
    }
}
