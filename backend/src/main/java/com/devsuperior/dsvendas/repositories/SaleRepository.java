package com.devsuperior.dsvendas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;

@Repository 
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT "
			+ "new com.devsuperior.dsvendas.dto.SaleSumDTO("
			+ "obj.seller,"
			+ " SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupeBySeller();
	
	@Query("SELECT "
			+ "new com.devsuperior.dsvendas.dto.SaleSuccessDTO("
			+ "obj.seller, "
			+ "SUM(obj.visited),"
			+ "SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupeBySeller();

	SaleDTO save();


	
	/*
	 * @Query("INSERT INTO tb_sales(" + "seller, " + "visited)," + "deals," +
	 * "amount," + " date)) " + "VALUES (," + "") SaleDTO save();
	 * 
	 * @Query("SELECT " + "new com.devsuperior.dsvendas.dto.SaleDTO(" +
	 * "obj.seller, " + "SUM(obj.visited)," + "SUM(obj.deals)) " +
	 * "FROM Sale AS obj " + "where obj.id = id") SaleDTO findById(long id);
	 */
}
