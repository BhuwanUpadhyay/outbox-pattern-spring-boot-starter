package io.github.bhuwanupadhyay.springboot.outbox.domain;

public interface OutboxPublisher {

    void fire(OutboxEvent outboxEvent);

}
