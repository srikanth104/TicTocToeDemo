package com.srikanth.tictoctoe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
public class PlayersModel  {
    @Id
    long playerId;
    String name;
    int ageOfPlayer;

}
