package com.github.bryancheung.healthservice.entity;

public class HealthContent {

    public final String serviceName;

    public final String version;

    public final boolean isAvailable;

    public HealthContent(String serviceName, String version, boolean isAvailable) {
        this.serviceName = serviceName;
        this.version = version;
        this.isAvailable = isAvailable;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getVersion() {
        return version;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
