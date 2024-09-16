package com.example.fpl.fantasy.elements.service.impl;


import com.example.fpl.fantasy.elements.model.Elements;
import com.example.fpl.fantasy.elements.persistence.IElementsDAO;
import com.example.fpl.fantasy.elements.service.IElementsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementsServiceImpl implements IElementsService {

    private final IElementsDAO iElementsDAO;

    public ElementsServiceImpl(IElementsDAO iElementsDAO) {
        this.iElementsDAO = iElementsDAO;
    }


    @Override
    public List<Elements> readElements() {
        return iElementsDAO.readElements();
    }
}
