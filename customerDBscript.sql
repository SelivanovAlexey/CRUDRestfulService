create table customer
(
  id        serial  not null
    constraint customer_pk
      primary key,
  last_name text    not null,
  district  text    not null,
  discount  integer not null
);

alter table customer
  owner to postgres;
  
INSERT INTO "public"."customer" ("id", "last_name", "district", "discount") VALUES (1, 'Ivanov', 'Kanavino', 20)

INSERT INTO "public"."customer" ("id", "last_name", "district", "discount") VALUES (2, 'Smirnov', 'Sormovo', 10)

INSERT INTO "public"."customer" ("id", "last_name", "district", "discount") VALUES (3, 'Petrov', 'Avtozavod', 15)

INSERT INTO "public"."customer" ("id", "last_name", "district", "discount") VALUES (DEFAULT, 'Sidorov', 'Nizhegorodsky', 17)