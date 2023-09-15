package com.srikanth.tictoctoe.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class BotsModel extends PlayersModel {
    int rankNumber;
}
