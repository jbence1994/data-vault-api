package hu.datavault.service

import hu.datavault.model.Message
import hu.datavault.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(private val messageRepository: MessageRepository) {

    fun getMessages(): List<Message> {
        return messageRepository.getMessages()
    }
}
