package com.example.fpl.fantasy.elements.persistence.impl;


import com.example.fpl.fantasy.elements.model.Elements;
import com.example.fpl.fantasy.elements.persistence.IElementsDAO;
import com.example.fpl.fantasy.elements.repository.ElementsRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ElementsDAOImpl implements IElementsDAO {

    private final ElementsRepository elementsRepository;

    public ElementsDAOImpl(ElementsRepository elementsRepository) {
        this.elementsRepository = elementsRepository;
    }

    @Override
    public List<Elements> readElements() {
        return elementsRepository.findAll();
    }
}
