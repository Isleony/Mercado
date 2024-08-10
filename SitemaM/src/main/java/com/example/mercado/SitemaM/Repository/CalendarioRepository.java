package com.example.mercado.SitemaM.Repository;

import com.example.mercado.SitemaM.model.Calendario;
import com.example.mercado.SitemaM.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarioRepository<DataTypeOfUniqueIdentifier> extends JpaRepository<Calendario, DataTypeOfUniqueIdentifier> {
}