package com.example;

import com.example.entity.Empresary;
import com.example.repository.RepositoryEmpresary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(App.class, args);
		RepositoryEmpresary repo = context.getBean(RepositoryEmpresary.class);

		List<Empresary> empresaries = List.of(
				new Empresary(null, "FechaOpe1","Producto1","Transaccion1",23,"Descripccion1","Usuario1","FechaVenci1",
						"Proveedor1"),
				new Empresary(null, "FechaOpe2","Producto2","Transaccion2",23,"Descripccion2","Usuario2","FechaVenci2",
						"Proveedor2"),
				new Empresary(null, "FechaOpe3","Producto3","Transaccion3",23,"Descripccion3","Usuario3","FechaVenci3",
						"Proveedor3"),
				new Empresary(null, "FechaOpe4","Producto4","Transaccion4",23,"Descripccion4","Usuario4","FechaVenci4",
						"Proveedor4"),
				new Empresary(null, "FechaOpe5","Producto5","Transaccion5",23,"Descripccion5","Usuario5","FechaVenci5",
						"Proveedor5"),
				new Empresary(null, "FechaOpe6","Producto6","Transaccion7",23,"Descripccion6","Usuario6","FechaVenci6",
						"Proveedor6")
		);

		repo.saveAll(empresaries);



	}

}
