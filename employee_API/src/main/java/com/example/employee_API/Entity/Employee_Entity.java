package com.example.employee_API.Entity;

public class Employee_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

    // Getters and Setters

    @Entity
    public class Item {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String description;
        private double startingPrice;

        // Getters and Setters
    }

    @Entity
    public class Bid {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private User bidder;

        @ManyToOne
        private Item item;

        private double amount;

        // Getters and Setters
    }

}
