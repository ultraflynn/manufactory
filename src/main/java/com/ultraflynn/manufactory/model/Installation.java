package com.ultraflynn.manufactory.model;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.ultraflynn.manufactory.exceptions.BuildingNameAlreadyUsed;
import com.ultraflynn.manufactory.exceptions.UnknownBuildingException;
import com.ultraflynn.manufactory.types.*;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Installation {
    public static Construction newInstallation() {
        return new Construction();
    }

    private Installation(Construction construction) {
    }

    public static final class Construction {
        private Map<String, Building> buildings = Maps.newHashMap();
        private Set<Link> links = Sets.newHashSet();

        public Construction extractor(String name, RawMaterial material) throws BuildingNameAlreadyUsed {
            addBuilding(name, new Extractor(name, material));
            return this;
        }

        public Construction basicFactory(String name, ProcessedMaterial material) throws BuildingNameAlreadyUsed {
            addBuilding(name, new Factory(name, material));
            return this;
        }

        public Construction advancedFactory(String name, RefinedCommodity commodity) throws BuildingNameAlreadyUsed {
            addBuilding(name, new Factory(name, commodity));
            return this;
        }

        public Construction advancedFactory(String name, SpecializedCommodity commodity) throws BuildingNameAlreadyUsed {
            addBuilding(name, new Factory(name, commodity));
            return this;
        }

        public Construction highTechFactory(String name, AdvancedCommodity commodity) throws BuildingNameAlreadyUsed {
            addBuilding(name, new Factory(name, commodity));
            return this;
        }

        private void addBuilding(String name, Building building) throws BuildingNameAlreadyUsed {
            if (Optional.ofNullable(buildings.put(name, building)).isPresent()) {
                throw new BuildingNameAlreadyUsed(name);
            }
        }

        public Construction launchpad(String name) throws BuildingNameAlreadyUsed {
            addBuilding(name, new Launchpad(name));
            return this;
        }

        public Construction silo(String name) throws BuildingNameAlreadyUsed {
            addBuilding(name, new Silo(name));
            return this;
        }

        public Construction link(String from, String to) throws UnknownBuildingException {
            links.add(new Link(findBuilding(from), findBuilding(to)));
            return this;
        }

        private Building findBuilding(String name) throws UnknownBuildingException {
            return Optional.ofNullable(buildings.get(name)).orElseThrow(() -> new UnknownBuildingException(name));
        }

        public Installation build() {
            return new Installation(this);
        }
    }
}
