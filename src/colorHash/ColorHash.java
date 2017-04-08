/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorHash;

import java.awt.Color;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author tim
 */
public class ColorHash {
            public Map<String, Color> ColorHash = new HashMap<>();

    /**
     * Added all needed values to the HashMap
     */
    public ColorHash() {
        ColorHash.put("black", Color.black);
        ColorHash.put("blue", Color.blue);
        ColorHash.put("cyan", Color.cyan);
        ColorHash.put("darkGray", Color.darkGray);
        ColorHash.put("gray", Color.gray);
        ColorHash.put("green", Color.green);
        ColorHash.put("yellow", Color.yellow);
        ColorHash.put("lightGray", Color.lightGray);
        ColorHash.put("magenta", Color.magenta);
        ColorHash.put("orange", Color.orange);
        ColorHash.put("pink", Color.pink);
        ColorHash.put("red", Color.red);
        ColorHash.put("white", Color.white);
        //System.out.println(ColorHash.size()); 
    }

    /**
     * Used for retrieving all keys.
     * @return a set of all keys
     */
    public Set getKeySet() {
        return ColorHash.keySet();
    }

    /**
     * Used to retrieve all Color objects
     * @return a collection of all color objects
     */
    public Collection<Color> getColorCollection() {
        return ColorHash.values();
    }

    /**
     * Get a specified color.
     * @param key the string value of the desired return color
     * @return the color that was specified in the string value
     */
    public Color getColor(String key) {
        return ColorHash.get(key);
    }

    /**
     * Total amount of color that the class contains
     * @return the total amount of colors.
     */
    public int size() {
        return ColorHash.size();
    }
}
