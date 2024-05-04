package hu.datavault

import hu.datavault.config.FileExtensionsConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(value = [FileExtensionsConfig::class])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
