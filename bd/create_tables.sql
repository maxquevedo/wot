create table timezones(
    id bigint primary key,
    value varchar(3) not null
);

create table seasons(
    id bigint primary key,
    name varchar(6) not null,
    position int not null
);

create table continents(
    id bigint primary key,
    name varchar(60) not null,
    current_season bigint references seasons(id) not null
);

create table countries(
    id bigint primary key,
    name varchar(60) not null,
    code varchar(3) not null,
    timezone varchar(3) not null,
    continent_id bigint references continents(id) not null,
    season_id bigint references seasons(id) not null
);

create table cities(
    id bigint primary key,
    name varchar(255) not null,
    country_id bigint references countries(id) not null
);


create table queries(
    id bigint primary key,
    query varchar(255) not null,
    country_id bigint references countries(id) not null,
    city_id bigint references cities(id) not null,
    gps_data text not null,
    response_data text not null,
    created_at timestamp not null default now(),
    updated_at timestamp not null default current_timestamp()
);