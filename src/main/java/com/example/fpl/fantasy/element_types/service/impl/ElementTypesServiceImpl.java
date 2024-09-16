package com.example.fpl.fantasy.element_types.service.impl;


import com.example.fpl.fantasy.element_types.model.ElementTypes;
import com.example.fpl.fantasy.element_types.persistence.IElementTypesDAO;
import com.example.fpl.fantasy.element_types.service.IElementTypesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementTypesServiceImpl implements IElementTypesService {

    private final IElementTypesDAO iElementTypesDAO;

    public ElementTypesServiceImpl(IElementTypesDAO iElementTypesDAO) {
        this.iElementTypesDAO = iElementTypesDAO;
    }

    @Override
    public List<ElementTypes> readElementTypes() {
        return iElementTypesDAO.readElementTypes();
    }
}
