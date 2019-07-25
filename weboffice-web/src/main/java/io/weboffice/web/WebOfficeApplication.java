package io.weboffice.web;

import io.fileman.spring.EnableFileman;
import io.httpdoc.spring.boot.EnableHttpdoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 在线办公应用
 *
 * @author Payne 646742615@qq.com
 * 2019/7/25 11:45
 */
@EnableFileman(value = "/logfile/*")
@EnableHttpdoc(packages = "io.weboffice", httpdoc = "在线办公应用")
@SpringBootApplication(scanBasePackages = "io.weboffice")
public class WebOfficeApplication {

    public static void main(String... args) {
        SpringApplication.run(WebOfficeApplication.class, args);
    }

}
