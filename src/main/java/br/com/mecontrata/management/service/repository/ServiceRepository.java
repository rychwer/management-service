package br.com.mecontrata.management.service.repository;

import br.com.mecontrata.management.service.entity.ServiceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServiceRepository extends MongoRepository<ServiceEntity, Long> {

    List<ServiceEntity> findAllByEmailProfessional(String email);

}
