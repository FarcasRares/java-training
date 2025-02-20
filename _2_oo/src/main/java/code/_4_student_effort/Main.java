package code._4_student_effort;

public class Main {

    public static void main(String[] args) {
        Fighter Paul=new Fighter("Paul",90,5);
        Fighter Mike=new Fighter("Mike",70,15);
        BoxingMatch match=new BoxingMatch(Paul,Mike);
        // System.out.println(match.fight());

        Premiu oscar1990=new Premiu("oscar",1990);
        Premiu oscar2000=new Premiu("oscar",2000);
        Premiu oscar2010=new Premiu("oscar",2010);
        Premiu oscar2018=new Premiu("oscar",2018);

        Actor actorOscar1990=new Actor("actor cu 2 oscaruri",35,new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010=new Actor("actor cu oscar din 2000",55,new Premiu[]{oscar2010});
        Actor actorOscar2018=new Actor("actor cu oscar din 2010",23,new Premiu[]{oscar2018});
        Actor actorFaraPremii01=new Actor("actor fara oscar 01",33,new Premiu[]{});
        Actor actorFaraPremii02=new Actor("actor fara oscar 02",60,new Premiu[]{});
        Actor actorFaraPremii03=new Actor("actor fara oscar 03",20,new Premiu[]{});

        Film film1=new Film(1990,"film cu actori de oscar",new Actor[]{actorOscar1990,actorFaraPremii01});
        Film film2=new Film(2010,"film cu actori fara premii2",new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
        Film film3=new Film(2010,"film cu actori fara premii3",new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
        Film film4=new Film(2018,"film cu actori de oscar",new Actor[]{actorOscar2010,actorOscar2018,actorFaraPremii02});
        Film film5=new Film(2018,"film cu actori fara premii5",new Actor[]{actorFaraPremii02,actorFaraPremii03});

        Studio studio1=new Studio("MGM",new Film[]{film1,film2});
        Studio studio2=new Studio("Disney",new Film[]{film3,film4,film5});

        if (studio1.getNrOfFilms()>2) System.out.println("Studio that have published more than 2 movies : "+studio1.getNume());
        if (studio2.getNrOfFilms()>2) System.out.println("Studio that have published more than 2 movies : "+studio2.getNume());

        String name=new String("actor cu 2 oscaruri");
        System.out.println("Studio in witch plays the actor with 'name actor cu 2 oscaruri'");
        studio1.SearchForActor(name);
        studio2.SearchForActor(name);
        System.out.println("Studio in witch plays at leas an actor with age above 50 : ");
        studio1.SearchForOldActor();
        studio2.SearchForOldActor();

    }
}
