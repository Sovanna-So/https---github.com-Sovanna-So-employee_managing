package main.java.com.example.employee_API.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

public interface ItemRepository extends JpaRepository<Item, Long> {
}

public interface BidRepository extends JpaRepository<Bid, Long> {
    List<Bid> findByItemId(Long itemId);
}
