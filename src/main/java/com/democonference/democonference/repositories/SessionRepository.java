package com.democonference.democonference.repositories;

import com.democonference.democonference.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
