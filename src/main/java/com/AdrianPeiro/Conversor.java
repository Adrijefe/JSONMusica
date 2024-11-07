package com.AdrianPeiro;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try{
            ObjectMapper mapper = new ObjectMapper();
            Musica musica = mapper.readValue(new File("musica.json"), Musica.class);

            XmlMapper xmlMapper = new XmlMapper();
            
        }catch (IOException e){}


    }
}