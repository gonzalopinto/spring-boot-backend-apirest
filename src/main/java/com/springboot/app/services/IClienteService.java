package com.springboot.app.services;

import java.util.List;

import com.springboot.app.models.entity.Cliente;

public interface IClienteService {

	List<Cliente> findAll();

	// Page<Cliente> findAll(Pageable pageable);
	//
	Cliente save(Cliente cliente);

	//
	Cliente findById(Long id);

	//
	void delete(Long id);
	//
	// List<Producto> findByNombre(String term);
	//
	// void saveFactura(Factura factura);
	//
	// Producto findProductById(Long id);
	//
	// Factura findFacturaById(Long id);
	//
	// void deleteFactura(Long id);
	//
	// Factura fetchFacturaByIdWithClienteWithItemFacturaWithProducto(Long id);
	//
	// Cliente fetchClienteByIdWithFacturas(Long id);
}
