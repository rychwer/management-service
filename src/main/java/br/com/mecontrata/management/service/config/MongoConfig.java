package br.com.mecontrata.management.service.config;

import br.com.mecontrata.management.service.config.converter.LocalDateTimeToStringConverter;
import br.com.mecontrata.management.service.config.converter.StringToLocalDateTimeConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MongoConfig {

    @Bean
    public MongoCustomConversions customConversions() {
        List<Converter<?, ?>> converterList = new ArrayList<>();
        converterList.add(new LocalDateTimeToStringConverter());
        converterList.add(new StringToLocalDateTimeConverter());

        return new MongoCustomConversions(converterList);
    }

}
