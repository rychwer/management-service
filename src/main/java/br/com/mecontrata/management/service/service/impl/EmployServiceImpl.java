package br.com.mecontrata.management.service.service.impl;

import br.com.mecontrata.management.service.entity.ServiceEntity;
import br.com.mecontrata.management.service.repository.ServiceRepository;
import br.com.mecontrata.management.service.service.EmployService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployServiceImpl implements EmployService {

    private ServiceRepository serviceRepository;

    public EmployServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public List<LocalDateTime> getDateServiceByEmailProfessional(String email) {
        final List<ServiceEntity> allByEmailProfessional = this.serviceRepository.findAllByEmailProfessional(email);
        return allByEmailProfessional.stream().map(item -> item.getDateService()).collect(Collectors.toList());
    }
}
