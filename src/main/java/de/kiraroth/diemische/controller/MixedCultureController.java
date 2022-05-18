package de.kiraroth.diemische.controller;

import de.kiraroth.diemische.model.*;
import de.kiraroth.diemische.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")

public class MixedCultureController {

    @Autowired
    private TimeRepository timeRepository;

    @Autowired
    private CropRepository cropRepository;

    @Autowired
    private CropTypeRepository cropTypeRepository;

    @Autowired
    private PosCropRotationRepository posCropRotationRepository;

    @Autowired
    private NegCropRotationRepository negCropRotationRepository;

    @Autowired
    private NegPolyCultivationRepository negPolyCultivationRepository;

    @Autowired
    private PosPolyCultivationRepository  posPolyCultivationRepository;

    //get all Times REST API
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/times")
    public List<Time> getTimeEntries() {
        System.out.println("Called get mapping...");
        return timeRepository.findAll();
    }

    /**
     * Get a specific crop
     * @param crop_id the id of the crop
     * @return
     */
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/crops/{crop_id}")
    public Optional<Crop> getCrop(@PathVariable Long crop_id) {
        return cropRepository.findById(crop_id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/crops")
    public List<Crop> getCropEntries() {
        System.out.println("Called get mapping...");
        return cropRepository.findAll();
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/posPolyCultivations")
    public List<PosPolyCultivation> getPosPolyCultivation() {
        System.out.println("Called get mapping...");
        return posPolyCultivationRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/negPolyCultivations")
    public List<NegPolyCultivation> getNegPolyCultivation() {
        System.out.println("Called get mapping...");
        return negPolyCultivationRepository.findAll();
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/posCropRotations")
    public List<PosCropRotation> getPosCropRotation() {
        System.out.println("Called get mapping...");
        return posCropRotationRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/negCropRotations")
    public List<NegCropRotation> getNegCropRotation() {
        System.out.println("Called get mapping...");
        return negCropRotationRepository.findAll();
    }
}
