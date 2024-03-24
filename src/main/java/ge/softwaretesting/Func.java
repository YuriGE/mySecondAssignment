package ge.softwaretesting;


public class Func implements Interface1, Interface2
{
    public void replaceSymbolA(String s)
    {
        System.out.println(s.replace("a","z"));
    }
   public void replaceSymbolB(String s)
    {
        System.out.println(s.replace("b","w"));
    }
}
