package com.democonference.democonference.repositories;

import com.democonference.democonference.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Speaker, Long> {
}
