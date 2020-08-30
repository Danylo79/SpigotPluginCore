package dev.dankom.spigotplugincore.util;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtil<T> {
    public List<T> toList(T... object) {
        List<T> out = new ArrayList<>();
        for (T in : object) {
            out.add(in);
        }
        return out;
    }

    public List<T> toArrayList(T... object) {
        ArrayList<T> out = new ArrayList<>();
        for (T in : object) {
            out.add(in);
        }
        return out;
    }
}
