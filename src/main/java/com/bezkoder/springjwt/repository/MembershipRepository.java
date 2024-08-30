package com.bezkoder.springjwt.repository;


import com.bezkoder.springjwt.models.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
