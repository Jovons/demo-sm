package com.example.demosm.my.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Created by wensi on 2017-07-12.
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    /**
     *
     * @param name
     * @return
     */
    Optional<Authority> findByAuthority(String name);

    /**
     *
     * @return
     */
    @Query("FROM Authority WHERE id = top")
    List<Authority> findTop();

    /**
     *
     * @param authorities
     * @return
     */
    List<Authority> findByAuthorityIn(List<String> authorities);

    /**
     *
     * @param authoritiesIdSeperatedByComma
     * @return
     */
    List<Authority> findByIdIn(Collection<Long> authoritiesIdSeperatedByComma);
}
