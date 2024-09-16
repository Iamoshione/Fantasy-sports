package com.example.fpl.fantasy.elements.persistence;

import com.example.fpl.fantasy.elements.model.Elements;

import java.util.List;

public interface IElementsDAO {
    List<Elements> readElements();
}
