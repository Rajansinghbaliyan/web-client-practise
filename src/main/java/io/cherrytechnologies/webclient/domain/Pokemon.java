package io.cherrytechnologies.webclient.domain;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;

@Data
@ToString
public class Pokemon{
    public ArrayList<Ability> abilities;
    public int base_experience;
    public ArrayList<Form> forms;
    public ArrayList<GameIndex> game_indices;
    public int height;
    public ArrayList<Object> held_items;
    public int id;
    public boolean is_default;
    public String location_area_encounters;
    public ArrayList<Move> moves;
    public String name;
    public int order;
    public ArrayList<Object> past_types;
    public Species species;
    public Sprites sprites;
    public ArrayList<Stat> stats;
    public ArrayList<Type> types;
    public int weight;
}


