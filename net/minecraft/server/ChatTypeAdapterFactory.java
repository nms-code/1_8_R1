package net.minecraft.server;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;

public class ChatTypeAdapterFactory implements TypeAdapterFactory {

    public ChatTypeAdapterFactory() {}

    public TypeAdapter create(Gson gson, TypeToken typetoken) {
        Class oclass = typetoken.getRawType();

        if (!oclass.isEnum()) {
            return null;
        } else {
            HashMap hashmap = Maps.newHashMap();
            Object[] aobject = oclass.getEnumConstants();
            int i = aobject.length;

            for (int j = 0; j < i; ++j) {
                Object object = aobject[j];

                hashmap.put(this.a(object), object);
            }

            return new ChatTypeAdapter(this, hashmap);
        }
    }

    private String a(Object object) {
        return object instanceof Enum ? ((Enum) object).name().toLowerCase(Locale.US) : object.toString().toLowerCase(Locale.US);
    }

    static String a(ChatTypeAdapterFactory chattypeadapterfactory, Object object) {
        return chattypeadapterfactory.a(object);
    }
}
