package hu.datavault.controller

import hu.datavault.model.Message
import hu.datavault.service.MessageService
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(private val messageService: MessageService) {

    @QueryMapping(name = "messages")
    fun products(): List<Message> {
        return messageService.getMessages()
    }
}
