package org.example

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import org.junit.jupiter.api.Test

class FruitApplicationTests{
    @Test
    fun test() {
        val jsonAsString ="{\"name\":\"a\",\"description\":\"description\"}";
        val objectMapper = ObjectMapper();
        objectMapper.registerModule(ParameterNamesModule())
        val readValue = objectMapper.readValue(jsonAsString, Fruit::class.java)
        print("Cool parsing done. name =${readValue.name}")
    }
}