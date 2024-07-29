package main.java.com.example.employee_API.Controllers;

import main.java.com.example.employee_API.Service.UserService;

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }
}

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }

    @PostMapping
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.saveItem(item));
    }
}

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }

    @PostMapping
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.saveItem(item));
    }
}

@RestController
@RequestMapping("/bids")
public class BidController {
    @Autowired
    private BidService bidService;

    @PostMapping
    public ResponseEntity<Bid> placeBid(@RequestBody Bid bid) {
        return ResponseEntity.ok(bidService.placeBid(bid));
    }

    @GetMapping("/item/{itemId}")
    public ResponseEntity<List<Bid>> getBidsByItem(@PathVariable Long itemId) {
        return ResponseEntity.ok(bidService.getBidsByItem(itemId));
    }
}
