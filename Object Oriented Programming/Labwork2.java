package Labwork2;

public class Labwork2 
{
	public static void main (String[] args)
    {
       Tribe2 t1 = new Tribe2();
       Tribe2 t2 = new Tribe2("Arboriginals");
       Tribe2 t3 = new Tribe2("Arboriginals", 75, 30);
       Tribe2 t4 = new Tribe2(t1);
       
       t1.toConsole();
       t2.toConsole();
       t3.toConsole();
       t4.toConsole();
    }
}
