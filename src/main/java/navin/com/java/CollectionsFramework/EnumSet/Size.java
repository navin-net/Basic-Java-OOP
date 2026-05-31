package navin.com.java.CollectionsFramework.EnumSet;

import java.util.HashSet;
import java.util.Set;

public enum Size {
    SMALL, MEDIUM,LARGE, EXTRALARGE;



    public static Set<Size> getAll(){
        Set<Size> sizes = new HashSet<>();
        sizes.add(Size.SMALL);
        sizes.add(Size.MEDIUM);sizes.add(Size.LARGE);sizes.add(Size.EXTRALARGE);


        return sizes;
    }
}
