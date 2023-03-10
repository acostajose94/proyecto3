package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDao;
import com.example.demo.entity.Empleado;
import com.example.demo.service.IEmpleadoService;

@Service
public class EmpleadoInterfaceImpl implements IEmpleadoService{

	@Autowired
	public IEmpleadoDao empleadodao;
	
	@Override
	public List<Empleado> findAll(){
		return (List<Empleado>) empleadodao.findAll();
	}
}
