package com.example.samplespringboot3javamaven.entity;

import org.springframework.data.repository.CrudRepository;

/**
 * <p>Member Repository
 *
 * @author dongyoung.kim
 * @since 1.0
 */
public interface MemberRepository extends CrudRepository<Member, Long> {

}
