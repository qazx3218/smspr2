package com.example.smspr2.repository;

import com.example.smspr2.domain.Tbboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbboardRepository extends JpaRepository<Tbboard, String> {
}