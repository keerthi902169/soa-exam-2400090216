
package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.CraftWorkshopEntity;
import com.klef.soa.exam.repository.CraftWorkshopRepository;


@Service
public class CraftWorkshopServiceImpl implements CraftWorkshopService {

    @Autowired
    private CraftWorkshopRepository repo;

    @Override
    public CraftWorkshopEntity addCrud(CraftWorkshopEntity crud) {
        return repo.save(crud);
    }

    @Override
    public List<CraftWorkshopEntity> getAllCrud() {
        return repo.findAll();
    }

    @Override
    public String deleteCrud(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Record deleted";
        }
        return "Record not found";
    }
}
