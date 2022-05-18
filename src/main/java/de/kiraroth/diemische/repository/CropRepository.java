package de.kiraroth.diemische.repository;

import de.kiraroth.diemische.model.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropRepository extends JpaRepository<Crop,Long> {
}
