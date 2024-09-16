package com.example.fpl.fantasy.element_types.persistence.impl;


import com.example.fpl.fantasy.element_types.model.ElementTypes;
import com.example.fpl.fantasy.element_types.persistence.IElementTypesDAO;
import com.example.fpl.fantasy.element_types.repository.ElementTypesRepository;
import org.springframework.stereotype.Component;

import javax.lang.model.element.Element;
import java.util.List;

@Component
public class ElementTypesDAOImpl implements IElementTypesDAO {

    private final ElementTypesRepository elementTypesRepository;

    public ElementTypesDAOImpl(ElementTypesRepository elementTypesRepository) {
        this.elementTypesRepository = elementTypesRepository;
    }


    @Override
    public List<ElementTypes> readElementTypes() {
        return elementTypesRepository.findAll();
    }
}
