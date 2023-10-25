package kz.middle.middle01liquibase.repository;

import kz.middle.middle01liquibase.model.AttachmentFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AttachmentFileRepository extends JpaRepository<AttachmentFile, Long> {
}