package org.jetbrains.kotlin.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ImportResource

@SpringBootApplication
//@ImportResource("classpath:app-config.xml")
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}

//https://www.baeldung.com/maven-webjars
//https://www.webjars.org/documentation#springboot