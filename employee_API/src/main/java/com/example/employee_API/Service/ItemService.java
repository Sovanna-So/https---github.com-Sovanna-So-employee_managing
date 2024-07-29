package main.java.com.example.employee_API.Service;

import java.util.Optional;

import main.java.com.example.employee_API.Repository.UserRepository;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}

@Service
public class BidService {
    @Autowired
    private BidRepository bidRepository;

    public Bid placeBid(Bid bid) {
        return bidRepository.save(bid);
    }

    public List<Bid> getBidsByItem(Long itemId) {
        return bidRepository.findByItemId(itemId);
    }
}
