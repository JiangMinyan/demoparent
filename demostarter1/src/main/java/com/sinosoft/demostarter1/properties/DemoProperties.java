package com.sinosoft.demostarter1.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jiangminyan
 * @create 2020-05-07 14:30
 **/
@Data
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {

    private String sayWhat;

    private String toWho;
}
