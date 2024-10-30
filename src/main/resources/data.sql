-- Insert sample users
INSERT INTO users (name, email, phone_number) VALUES
('Alice Johnson', 'alice@example.com', '1234567890'),
('Bob Smith', 'bob@example.com', '0987654321');

-- Insert sample restaurants
INSERT INTO restaurants (name, address) VALUES
('Pizza Palace', '123 Pizza Lane'),
('Burger Barn', '456 Burger Ave');

-- Insert sample menu items
INSERT INTO menu_items (name, price, restaurant_id) VALUES
('Margherita Pizza', 9.99, 1),
('Pepperoni Pizza', 12.99, 1),
('Cheeseburger', 8.99, 2),
('Veggie Burger', 7.99, 2);

-- Insert sample orders
INSERT INTO orders (user_id, menu_item_id, status) VALUES
(1, 1, 'Completed'),
(1, 3, 'Pending'),
(2, 2, 'Completed');