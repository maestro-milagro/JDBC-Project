create table public.CUSTOMERS (
	 id serial PRIMARY KEY,
	 CusName varchar(255) NOT NULL,
	 surname varchar(255) NOT NULL,
	 age integer NOT NULL,
	 phone_number varchar(255)
);

insert into CUSTOMERS
values
(0, 'Sergey', 'Korchagin', 21, '222222222222222'),
(1, 'AleXey', 'Ivanov', 51, '22225462222222'),
(2, 'aleXey', 'Petrov', 41, '22222221352222');

create table ORDERS (
	id serial PRIMARY KEY,
	NuyDate date NOT NULL,
	customer_id integer NOT NULL REFERENCES CUSTOMERS (id),
	product_name varchar(255) NOT NULL,
	amount int
);

insert into ORDERS
values
(0, '2023-01-08', 0, 'bread', 2),
(1, '2022-06-08', 1, 'milk', 1),
(2, '2021-01-08', 2, 'apple', 5)