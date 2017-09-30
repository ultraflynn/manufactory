package com.ultraflynn.manufactory;

import com.ultraflynn.manufactory.model.Facility;

public interface FacilityBuilder {
    Facility fromFile(String definitionFile);
}
