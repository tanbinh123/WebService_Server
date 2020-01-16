package com.jtao.server;

import com.jtao.serverinterface.WebServiceInterface;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloServer implements WebServiceInterface {
    @WebMethod
    public String execute(String params) {
        return "hello";
    }
}
