package com.example.game;

import java.util.List;

/**
 * Created by Anavil Patel on 7/13/2016.
 */
public interface ISavable {

    List<String > write();
    void read(List<String> savedValues);

}
