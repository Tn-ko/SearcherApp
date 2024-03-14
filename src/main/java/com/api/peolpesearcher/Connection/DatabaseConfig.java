package com.api.peolpesearcher.Connection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() { //подключение к БД
        Map<String, String> dbSettings = parseDBSettingsFromDesktop(); //вызов метода с настройками подключения
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:" + dbSettings.get("port"));// устанавливаем Url из пар ключ:значение, находим введенное раннее значение по ключу port
        dataSource.setUsername(dbSettings.get("username"));
        dataSource.setPassword(dbSettings.get("password"));
        System.err.println("port: "+dbSettings.get("port"));
        System.err.println("Username: "+dbSettings.get("username"));
        System.err.println("Password: "+dbSettings.get("password"));
        return dataSource;
    }

    public static Map<String, String> parseDBSettingsFromDesktop() { //метод, извлекающий данные для подключения
        Map<String, String> dbSettings = new HashMap<>();
        String desktopPath = System.getProperty("user.home") + "/Desktop/";
        String filePath = desktopPath + "DB_settings.txt"; //добираемся до файла на рабочем столе

        try {
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {//проходимся по кажой строке в блокноте
                String[] parts = line.split("=");// массив строк, в него входят слова, разделенные после =
                if (parts.length == 2) {// если 2 таких слова
                    dbSettings.put(parts[0].trim(), parts[1].trim());//записываем в Map в качестве пар ключ=значение 2 этих слова
                }
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        return dbSettings;
    }
}
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }

