package org.example.domain.dto.repo;

import org.example.domain.dto.TokenHeaderDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenHeaderRepository extends CrudRepository<TokenHeaderDTO, String> {
}
