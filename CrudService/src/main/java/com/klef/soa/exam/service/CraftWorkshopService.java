
package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.CraftWorkshopEntity;

public interface CraftWorkshopService {

    public CraftWorkshopEntity addCrud(CraftWorkshopEntity crud);

    public List<CraftWorkshopEntity> getAllCrud();

   
    public String deleteCrud(Long id);
}
