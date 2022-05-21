package com.company.designPatternFinalProject.proxy;

import java.util.ArrayList;
import java.util.List;

class ProxyInternet implements Internet {
    private final Internet internet = new RealInternet();
    private static final List<String> deniedSites;

    static {
        deniedSites = new ArrayList<>();
        deniedSites.add("fishy.com");
        deniedSites.add("corn.com");
        deniedSites.add("tadum.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (deniedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access is denied for: " + serverHost);
        }
        internet.connectTo(serverHost);
    }

}
