USE purchase_report;

INSERT INTO Purchase_Order VALUES
(4096, 'Abc', 'ABC PTE LTD'),
(4097, 'Syncorp', 'Synthesis Corp Ltd'),
(4098, 'Terra', 'Terra Xchange Pte Ltd'),
(4099, 'Abc', 'ABC PTE LTD');

INSERT INTO Purchase_Detail VALUES
(4096, 'Apple', 2),
(4096, 'Banana', 4),
(4097, 'Apple', 1),
(4098, 'Carrot', 3),
(4098, 'Banana', 2),
(4099, 'Banana', 4),
(4099, 'Carrot', 3),
(4099, 'Apple', 5);

INSERT INTO Product_Detail VALUES
('Apple', 0.95),
('Banana', 1.20),
('Carrot', 0.50),
('Durian', 3.05);