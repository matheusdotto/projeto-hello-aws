package br.com.matheusotto.ssm.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class ParameterStoreConfiguration {

    @Value("${helloWord}")
    private String helloWord;

    public String getHelloWord(){
        return helloWord;
    }

    public void setHelloWord(String helloWord){
        this.helloWord = helloWord;
    }


}
