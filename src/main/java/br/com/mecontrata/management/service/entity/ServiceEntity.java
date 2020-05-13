package br.com.mecontrata.management.service.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "service")
@Data
public class ServiceEntity {

    @Id
    private Long id;

    private String name;

    private String description;

    private LocalDateTime dateService;

    private String emailClient;

    @Indexed
    private String emailProfessional;

    private String serviceStatus;

}
