package com.tuling.testImport.config;

import com.tuling.testImport.compent.Car;
import com.tuling.testImport.compent.Person;
import com.tuling.testImport.importSelect.TulingBeanDefinitionRegister;
import com.tuling.testImport.importSelect.TulingImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(value = {Person.class, Car.class})
//@Import(value = {Person.class, Car.class, TulingImportSelector.class})
@Import(value = {Person.class, Car.class, TulingImportSelector.class, TulingBeanDefinitionRegister.class})
public class MainConfig {
}
