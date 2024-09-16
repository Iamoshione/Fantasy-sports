package com.example.fpl.fantasy.element_types.persistence;

import com.example.fpl.fantasy.element_types.model.ElementTypes;

import java.util.List;

public interface IElementTypesDAO {
    List<ElementTypes> readElementTypes();
}
