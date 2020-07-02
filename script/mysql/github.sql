create table global_params(
root_key varchar(20) not null,
sub_key varchar(20) not null,
value varchar(20) not null,
primary key (root_key,sub_key)
)


