package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Empleado;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.service.Impl.EmpleadoInterfaceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
@Autowired
private EmpleadoInterfaceImpl empleadoService;
@GetMapping("/listar")
public List<Empleado> getEmpleados(){
	return empleadoService.findAll();
};
	
}
