package com.company.designPatternFinalProject.proxy;

public class Main {
    public static void main(String[] args) throws Exception {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("YouTube.com");
            internet.connectTo("FaceBook.com");
            internet.connectTo("CORN.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

