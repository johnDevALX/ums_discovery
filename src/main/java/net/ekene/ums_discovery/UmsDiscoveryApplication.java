package net.ekene.ums_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UmsDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(UmsDiscoveryApplication.class, args);
    }
}
