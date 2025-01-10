package com.ccp.tp3.JObjects;

import java.util.List;

public record ApiResponse(
        String type,
        String version,
        List<Feature> features,
        String attribution,
        String licence,
        String query,
        int limit
) {
    public record Feature(
            String type,
            Geometry geometry,
            Properties properties
    ) {
        public record Geometry(
                String type,
                List<Double> coordinates
        ) {}
        public record Properties(
                String label,
                double score,
                String housenumber,
                String id,
                String type,
                String name,
                String postcode,
                String citycode,
                double x,
                double y,
                String city,
                String context,
                double importance,
                String street
        ) {}
    }
}
