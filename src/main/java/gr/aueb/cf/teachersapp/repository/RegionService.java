package gr.aueb.cf.teachersapp.repository;

import gr.aueb.cf.teachersapp.model.static_data.Region;
import gr.aueb.cf.teachersapp.service.IRegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//RequiredArgsConstructor
public class RegionService implements IRegionService {

    private final RegionRepository regionRepository;

    @Autowired
    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public List<Region> findAllRegions() {
        return regionRepository.findAll();
    }
}
