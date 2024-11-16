package com.devsuperior.dslist.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.EmbeddedId;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")


public class Beloging {
    @EmbeddedId
  private BelogingPK id;
    private Integer position;



public Beloging() {

}

    public Beloging(Game game,GameList list,  Integer position) {
        this.id.setGame(game);
        id.setGameList(list);
        this.position=position;
    }

    public BelogingPK getId() {
        return id;
    }

    public void setId(BelogingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beloging beloging = (Beloging) o;
        return Objects.equals(id, beloging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
