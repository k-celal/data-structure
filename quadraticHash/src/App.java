public class App {
    public static void main(String[] args) throws Exception {
        Hash hs = new Hash();
        hs.hashAdd(85263);
        hs.hashAdd(85223);
        hs.hashAdd(85243);
        hs.hashAdd(85293);
        hs.hashAdd(85283);
        hs.hashAdd(85273);
        hs.hashAdd(85163);
        hs.hashAdd(85363);
        hs.hashAdd(85963);
        hs.hashAdd(85863);
        hs.hashAdd(85763);
        hs.hashAdd(85663);
        hs.hashAdd(85563);
        System.out.println(hs.quadraticSearch(85563));
        hs.Delete(85563);
        return;
    }
}
