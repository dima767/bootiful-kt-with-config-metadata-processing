package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(value = "demo")
class DemoProperties {

    /**
     * This is a demo property
     */
    val stringProp: String? = null
}