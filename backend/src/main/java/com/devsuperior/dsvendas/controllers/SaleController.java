package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = saleService.pageFindAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupeBySeller() {
		List<SaleSumDTO> list = saleService.amountGroupeBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupeBySeller() {
		List<SaleSuccessDTO> list = saleService.successGroupeBySeller();
		return ResponseEntity.ok(list);
	}
	
	
	@PostMapping
	public SaleDTO create(@RequestBody SaleDTO saleDTO) {
		return saleService.save(saleDTO);
	}
	
	///Update
	@PutMapping(value = "{id}")
	public ResponseEntity<?> update(@PathVariable("id") long id,
			@RequestBody SaleDTO saleDTO) {
		return saleService.findById(id)
				.map(record -> {
					
					record.setName(contactturaUser.getName());
					record.setUsername(contactturaUser.getUsername());
					record.setPassword(criptoPassword(contactturaUser.getPassword()));
					record.setAdmin(contactturaUser.isAdmin());
					
					SaleDTO update = repository.save(record);
					
					return ResponseEntity.ok().body("Usuário" + update.getUsername()+ " de nome "+update.getName()+" foi atualizado com sucesso!! \n\n");
				}).orElse(ResponseEntity.notFound().build());
	}
}
	