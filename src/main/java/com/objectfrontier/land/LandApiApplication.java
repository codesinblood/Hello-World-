package com.objectfrontier.land;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.objectfrontier.land.utils.FileStorageProperties;

/**
 * @author hariraj.sampath
 * @since 1.0.0
 *	
 */
@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class LandApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LandApiApplication.class, args);
    }
}
