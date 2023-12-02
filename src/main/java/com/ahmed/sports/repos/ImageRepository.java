package com.ahmed.sports.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.sports.entities.Image;

public interface ImageRepository extends JpaRepository<Image , Long> {
}