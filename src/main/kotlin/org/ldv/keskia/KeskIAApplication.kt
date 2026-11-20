package org.ldv.keskia

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(
    scanBasePackages = [
        "org.ldv.keskia",
        "config",
        "controller",
        "model",
        "service"
    ]
)
@EntityScan(basePackages = ["model.entity"])
@EnableJpaRepositories(basePackages = ["model.dao"])
class KeskIAApplication

fun main(args: Array<String>) {
    runApplication<KeskIAApplication>(*args)
}