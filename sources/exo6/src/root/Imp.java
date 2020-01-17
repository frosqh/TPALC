package root;

import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.objectweb.fractal.api.control.IllegalLifeCycleException;

public class Imp implements BindingController,Doc,Command {
    private LevelN cartoucheN;
    private LevelC cartoucheC;
    private Count magasinPapier;
    private Alimentation alim;
    private NumDoc doc;
    private boolean hasBeenPrinted = false;


    @Override
    public String[] listFc() {
        return new String[]{"cartoucheEncreN","cartoucheEncreC","magasinPapier","alimElec","imageNum"};
    }

    @Override
    public Object lookupFc(String s) throws NoSuchInterfaceException {
        switch (s){
            case "cartoucheEncreN": return cartoucheN;
            case "cartoucheEncreC": return cartoucheC;
            case "magasinPapier": return magasinPapier;
            case "alimElec": return alim;
            case "copieObtenue": return doc;
        }
        return null;
    }

    @Override
    public void bindFc(String s, Object o) throws NoSuchInterfaceException, IllegalBindingException, IllegalLifeCycleException {
        switch (s){
            case "cartoucheEncreN": cartoucheN = (LevelN) o; break;
            case "cartoucheEncreC": cartoucheC = (LevelC) o;break;
            case "magasinPapier": magasinPapier = (Count) o;break;
            case "alimElec": alim = (Alimentation) o;break;
            case "copieObtenue": doc = (NumDoc) o;break;
        }
    }

    @Override
    public void unbindFc(String s) throws NoSuchInterfaceException, IllegalBindingException, IllegalLifeCycleException {
        switch (s){
            case "cartoucheEncreN": cartoucheN = null;
            case "cartoucheEncreC": cartoucheC = null;
            case "magasinPapier": magasinPapier = null;
            case "alimElec": alim = null;
            case "copieObtenue": doc = null;
        }
    }

    @Override
    public String getContent() {
        if (hasBeenPrinted)
            return doc.getContent();
        return null;
    }

    @Override
    public void execute() {
        hasBeenPrinted = true;
    }
}
