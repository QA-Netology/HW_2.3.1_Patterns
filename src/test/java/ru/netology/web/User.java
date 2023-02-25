package ru.netology.web;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor

public class User {
    String city;
    String name;
    String phone;
}
