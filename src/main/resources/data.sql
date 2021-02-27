INSERT INTO orders (id, user_id, status, created_at) VALUES (1, 1, 'Payment required', '2021-02-24 14:25:04.810221');
INSERT INTO orders (id, user_id, status, created_at) VALUES (2, 1, 'Payment required', '2021-02-24 15:21:03.810221');

INSERT INTO products (id, name, price, status, created_at) VALUES (125, 'nike shoes', 2500, 'in_stock', '2021-02-26 14:35:04.810221');
INSERT INTO products (id, name, price, status, created_at) VALUES (240, 'adidas shoes', 2500, 'in_stock', '2021-01-23 14:37:04.810221');
INSERT INTO products (id, name, price, status, created_at) VALUES (32, 'puma shirt', 1000, 'out_of_stock', '2021-02-20 12:36:00.810221');
INSERT INTO products (id, name, price, status, created_at) VALUES (98, 'reebok pants', 1500, 'running_low', '2020-12-26 18:35:04.810221');

INSERT INTO order_items (order_id, product_id, quantity) VALUES (1, 125, 2);
INSERT INTO order_items (order_id, product_id, quantity) VALUES (1, 98, 1);
INSERT INTO order_items (order_id, product_id, quantity) VALUES (2, 98, 2);
INSERT INTO order_items (order_id, product_id, quantity) VALUES (2, 240, 1);
INSERT INTO order_items (order_id, product_id, quantity) VALUES (2, 125, 1);