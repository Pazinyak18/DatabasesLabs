use films;

insert into film
   (name,description) 
	values
    ('Titanic','The RMS Titanic, a luxury steamship, sank in the early hours of April 15, 1912, off the coast of Newfoundland in the North Atlantic after sideswiping an iceberg during its maiden voyage');

insert into actor 
	(first_name,second_name,rating)
    values
		('Leonardo ', 'DiCaprio',10),
		('Kate',' Winslet',9),
        ('Billy','Zane',18),
        ('Kathy','Bates',21),
        ('Frances','Fisher',59);
        
insert into user 
	(name,email)
    values
		('Dwayne ', 'Dwayne@gmail.com'),
		('John',' John@gmail.com'),
        ('Vlad','Vlad@gmail.com'),
        ('Arsen','Arsen@gmail.com'),
        ('Max','Max@gmail.com');

        
insert into comments
	(film_id,user_id,rating,text)
    values 
		(1,3,5,'Very good and interesting film');
        
insert into facts
	(user_id,text)
    values
		(1,'He was born on November 11, 1974 in Los Angeles, California. ');
        
insert into album_actor
	(film_id,actor_id)
    values 
		(1,1);

