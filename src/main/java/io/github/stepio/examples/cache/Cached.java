package io.github.stepio.examples.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Cached {

    @Cacheable("uuid")
    public UUID getCachedRandomUUID(String key) {
        return UUID.randomUUID();
    }
}
