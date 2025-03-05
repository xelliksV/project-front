package com.game.controller;

import com.game.entity.Profession;
import com.game.entity.Race;

import java.util.Date;

public class PlayerInfo {
    public Long id;
    public String name;
    public String title;
    public Race race;
    public Profession profession;
    public Date birthday;
    public Boolean banned;
    public Integer level;
}