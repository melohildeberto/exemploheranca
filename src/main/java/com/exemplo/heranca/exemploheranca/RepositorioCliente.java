package com.exemplo.heranca.exemploheranca;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCliente extends JpaRepository<Cliente, Long>{
    
}
