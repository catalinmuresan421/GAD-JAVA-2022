package com.company.designPatternFinalProject.proxy;

interface Internet {
    void connectTo(String serverHost) throws Exception;
}

class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Waiting for: " + serverHost + ". Connected");
    }
}
