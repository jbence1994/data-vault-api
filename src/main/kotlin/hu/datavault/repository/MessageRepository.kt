package hu.datavault.repository

import hu.datavault.model.Message
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class MessageRepository {

    fun getMessages(): List<Message> {
        return listOf(
            Message(
                id = UUID.randomUUID().toString(),
                text = "Hello, World!",
            ),
            Message(
                id = UUID.randomUUID().toString(),
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
            ),
        )
    }
}
