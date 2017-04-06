package br.com.facebook.handler.outgoing.domain

import br.com.facebook.handler.outgoing.template.Attachment
import groovy.transform.Canonical

/**
 * Created by jonathan on 31/03/17.
 */
@Canonical
class OutputMessage {
    Recipient recipient
    Message message
}

@Canonical
class Recipient{
    String id
}

@Canonical
class Message{
    String text
    Attachment attachment
}
