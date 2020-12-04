create table customer(
	customer_number int auto_increment,
    fullname varchar(50) not null,
    address varchar(100) not null,
    email varchar(255) unique not null,
    phone int unique,
    primary key (customer_number)
);

create table Accounts(
	account_number int auto_increment,
    account_type varchar(10),
    date1 date,
    balance int,
    primary key (account_number),
    customer_number int,
	foreign key (customer_number) references customer(customer_number)
);

create table Transactions(
	 tran_number int auto_increment,
     account_number int,
     date1 date,
     amounts int,
     descriptions varchar(255),
     primary key (tran_number),
     foreign key (account_number) references accounts(account_number)
);