package gr.aueb.cf.teachersapp.service;

import gr.aueb.cf.teachersapp.model.static_data.Region;

import java.util.List;

public interface IRegionService {
    List<Region> findAllRegions();
}
