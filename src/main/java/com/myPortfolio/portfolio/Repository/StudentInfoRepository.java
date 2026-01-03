package com.myPortfolio.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myPortfolio.portfolio.Model.StudentInfo;

public interface StudentInfoRepository extends JpaRepository<StudentInfo, Long>{

}
