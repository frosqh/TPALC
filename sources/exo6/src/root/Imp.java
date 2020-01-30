package root;

import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.objectweb.fractal.api.control.IllegalLifeCycleException;

public class Imp implements BindingController,Doc,CommandImp {
    private LevelN cartoucheEncreN;
    private LevelC cartoucheEncreC = null;
    private Count magasinPapier;
    private Alimentation alim;
    private NumDoc doc;
    private boolean hasBeenPrinted = false;

    //public Imp() {}

    @Override
    public String[] listFc() {
        return new String[]{"cartoucheEncreN","cartoucheEncreC","magasinPapier","alimElec","imageNum"};
    }

    @Override
    public Object lookupFc(String s) throws NoSuchInterfaceException {
        switch (s){
            case "cartoucheEncreN": return cartoucheEncreN;
            case "cartoucheEncreC": return cartoucheEncreC;
            case "magasinPapier": return magasinPapier;
            case "alimElec": return alim;
            case "imageNum" : return doc;
        }
        return null;
    }

    @Override
    public void bindFc(String s, Object o) throws NoSuchInterfaceException, IllegalBindingException, IllegalLifeCycleException {
        switch (s){
            case "cartoucheEncreN": cartoucheEncreN = (LevelN) o; break;
            case "cartoucheEncreC": cartoucheEncreC = (LevelC) o;break;
            case "magasinPapier": magasinPapier = (Count) o;break;
            case "alimElec": alim = (Alimentation) o;break;
            case "imageNum": doc = (NumDoc) o;break;
        }
    }

    @Override
    public void unbindFc(String s) throws NoSuchInterfaceException, IllegalBindingException, IllegalLifeCycleException {
        switch (s){
            case "cartoucheEncreN": cartoucheEncreN = null;break;
            case "cartoucheEncreC": cartoucheEncreC = null;break;
            case "magasinPapier": magasinPapier = null;break;
            case "alimElec": alim = null;break;
            case "imageNum": doc = null;break;
        }
    }

    @Override
    public String getContent() {
        if (hasBeenPrinted)
            return doc.getContent();
        //return "BITE ! ";
        return null;
    }

    @Override
    public void executeImp() {
        hasBeenPrinted = true;
    }
}
