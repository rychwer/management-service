package br.com.mecontrata.management.service.facade;

import br.com.mecontrata.management.service.service.EmployService;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
@Slf4j
public class ServiceFacade {

    private EmployService employService;

    public ServiceFacade(EmployService employService) {
        this.employService = employService;
    }

    public List<LocalDateTime> getScheduledDays(String email) {
        return this.employService.getDateServiceByEmailProfessional(email);
    }

    @KafkaListener(topics = "${topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    private void consumerServicePaid(ConsumerRecord consumerRecord) {
        log.info("key: " + consumerRecord.key());
        log.info("Headers: " + consumerRecord.headers());
        log.info("Partion: " + consumerRecord.partition());
        log.info("Order: " + consumerRecord.value());
    }

}
