package com.jtao.publish;

import com.jtao.server.HelloServer;

import javax.xml.ws.Endpoint;

public class WebServicePublish {
    public static void main(String[] args) {
        String url = "http://127.0.0.1:8089/ws_service/hello";
        Endpoint.publish(url,new HelloServer());
    }
}
