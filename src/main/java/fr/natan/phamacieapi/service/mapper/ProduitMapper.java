package fr.natan.phamacieapi.service.mapper;


import fr.natan.phamacieapi.domain.*;
import fr.natan.phamacieapi.service.dto.ProduitDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Produit} and its DTO {@link ProduitDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ProduitMapper extends EntityMapper<ProduitDTO, Produit> {



    default Produit fromId(Long id) {
        if (id == null) {
            return null;
        }
        Produit produit = new Produit();
        produit.setId(id);
        return produit;
    }
}
