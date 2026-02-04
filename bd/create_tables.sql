create table timezones(
    id UUID primary key,
    value varchar(3) not null
);

create table seasons(
    id UUID primary key,
    name varchar(6) not null,
    position int not null
);

create table continents(
    id UUID primary key,
    name varchar(60) not null,
    current_season UUID references seasons(id) not null
);

create table countries(
    id UUID primary key,
    name varchar(60) not null,
    timezone varchar(3) not null,
    continent_id UUID references continents(id) not null,
    season_id UUID references seasons(id) not null
);

create table cities(
    id UUID primary key,
    name varchar(255) not null,
    country_id UUID references countries(id) not null
);


create table queries(
    id UUID primary key,
    query varchar(255) not null,
    country_id UUID references countries(id) not null,
    city_id UUID references cities(id) not null,
    gps_data text not null,
    response_data text not null,
    created_at timestamp not null,
    updated_at timestamp not null
);