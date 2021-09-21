package com.example.cursomc;

import com.example.cursomc.domain.*;
import com.example.cursomc.domain.enums.EstadoPagamento;
import com.example.cursomc.domain.enums.TipoCliente;
import com.example.cursomc.repositories.*;

import com.example.cursomc.services.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;


@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Users\\karolina.silva\\workspace\\temp-fotos\\foto1.jfif");
	}
}
