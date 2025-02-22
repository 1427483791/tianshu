package com.example.tianshu.service;

import com.example.tianshu.dao.model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long> {
    Visitor findByIpAndVisitDate(String ip, LocalDate visitDate);
}
