create table pomos(
   uuid VARCHAR(100) NOT NULL ,
   created_at DATE NOT NULL,
   updated_at DATE NOT NULL,
   description VARCHAR(100) NOT NULL,
   started_at DATE NOT NULL,
   ended_at DATE NOT NULL,
   local_started_at DATE NOT NULL,
   local_ended_at DATE NOT NULL,
   length INT NOT NULL,
   abandoned tinyint(1) NOT NULL,
   manual tinyint(1) NOT NULL	
);