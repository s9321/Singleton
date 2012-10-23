import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
 
public class KsiazkaTelefoniczna {
 
    //tworzy jedn¹ i tylko jedn¹ instancjê klasy KsiazkaTelefoniczna
    private static KsiazkaTelefoniczna instance = new KsiazkaTelefoniczna();
 
    //prywatny konstruktor
    private KsiazkaTelefoniczna() {}
 
    //zwraca referencjê do obiektu
    public static KsiazkaTelefoniczna getInstance()
    {
        return instance;
    }
	
	private Map<Integer, String> kontakty =
        new TreeMap<Integer, String>();
 
    public void dodajKontakt(Integer numer, String nazwa)
    {
        kontakty.put(numer, nazwa);
    }
 
    public boolean edytujKontakt(Integer staryNumer, Integer nowyNumer,
                String nazwa)
    {
        if(kontakty.containsKey(staryNumer))
        {
            kontakty.remove(staryNumer);
            kontakty.put(nowyNumer, nazwa);
            return true;
        }
        return false;
    }
 
    public void zobaczKontakty()
    {
    	//umo¿liwia iteracjê po zawartoœci mapy kontakty
        Set<Map.Entry<Integer, String>> set = kontakty.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        
        while(it.hasNext())
        {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + ": " +
                        entry.getValue());
        }
    }
}