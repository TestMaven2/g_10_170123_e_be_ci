package de.telran.g_10_170123_e_be_ci.service;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

    public int getNumber() {
        return 7;
    }

    public int getDoubledNumber() {
        int result = getNumber() * 2 + 1;
        return result;
    }
}