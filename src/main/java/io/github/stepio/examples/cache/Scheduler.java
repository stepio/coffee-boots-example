package io.github.stepio.examples.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
public class Scheduler {

    @Autowired
    private Cached cached;
    private Random random;
    private String key;

    public Scheduler() {
        random = new Random();
        key = newKey();
    }

    private String newKey() {
        return String.valueOf(random.nextLong());
    }

    @Scheduled(fixedDelay = 3000)
    public void schedule() {
        UUID value = cached.getCachedRandomUUID(key);
        System.out.println(String.format("Key: %s, cached value: %s", key, value));
        key = newKey();
        value = cached.getCachedRandomUUID(key);
        System.out.println(String.format("Key: %s, random value: %s", key, value));
    }
}
