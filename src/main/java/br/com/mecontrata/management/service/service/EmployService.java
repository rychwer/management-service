package br.com.mecontrata.management.service.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface EmployService {

    List<LocalDateTime> getDateServiceByEmailProfessional(String email);

}