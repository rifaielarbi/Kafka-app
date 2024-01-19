package net.rifai.demospringkafka.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class CarPosition {
    private double latitude;
    private double longitude;

}