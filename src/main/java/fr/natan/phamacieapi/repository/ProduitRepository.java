package fr.natan.phamacieapi.repository;

import fr.natan.phamacieapi.domain.Produit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Product entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
	@Query("select p from Produit p where upper(p.code) like  %:searchValue% or upper(p.name) like  %:searchValue%")
	Page<Produit> findAllByCodeOrName(Pageable pageable, @Param("searchValue") String searchValue);
}
