package com.example.demo.files;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepo extends JpaRepository<File, Long> {
    File findByName(File nom);
}
