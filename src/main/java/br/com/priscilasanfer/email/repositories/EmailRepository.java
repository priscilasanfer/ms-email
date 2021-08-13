package br.com.priscilasanfer.email.repositories;

import br.com.priscilasanfer.email.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<Email, UUID> {
}
