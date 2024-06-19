package com.socialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.socialMedia.model.SocialMediaData;

public interface SocialMediaDataRepository extends JpaRepository<SocialMediaData, Long> {
}

