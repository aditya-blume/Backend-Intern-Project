package org.example.Respositories;

import org.example.Entities.OrgCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgCodeRepository extends JpaRepository<OrgCode,Long> {

}
