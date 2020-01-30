package root;

import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.objectweb.fractal.api.control.IllegalLifeCycleException;

public class Num implements BindingController,NumDoc,CommandNum {

    Doc doc;
    Alimentation alim;
    boolean hasBeenNum = false;

    @Override
    public String[] listFc() {
        return new String[]{"documentOriginal","alimElec"};
    }

    @Override
    public Object lookupFc(String s) throws NoSuchInterfaceException {
        switch(s){
            case "documentOriginal": return doc;
            case "alimElec": return alim;
        }
        return null;
    }

    @Override
    public void bindFc(String s, Object o) throws NoSuchInterfaceException, IllegalBindingException, IllegalLifeCycleException {
        switch(s){
            case "documentOriginal": doc = (Doc) o;break;
            case "alimElec": alim = (Alimentation) o;break;
        }
    }

    @Override
    public void unbindFc(String s) throws NoSuchInterfaceException, IllegalBindingException, IllegalLifeCycleException {
        switch(s){
            case "documentOriginal": doc = null;break;
            case "alimElec": alim = null;break;
        }
    }

    @Override
    public void executeNum() {
        //TODO Numériser...
        hasBeenNum = true;
    }

    @Override
    public String getContent() {
        if (hasBeenNum)
            return doc.getContent();
        return null;
    }
}
