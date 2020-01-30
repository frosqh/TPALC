package root;

import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.objectweb.fractal.api.control.IllegalLifeCycleException;

public class User implements BindingController,Runnable {

    private CommandImp commandImp;
    private CommandNum commandNum;
    private Doc copieObtenue;

    @Override
    public void run() {
        commandNum.executeNum();
        commandImp.executeImp();
        System.out.println(copieObtenue.getContent());
    }

    @Override
    public String[] listFc() {
        return new String[]{"commandeNum","commandeImp","copieObtenue"};
    }

    @Override
    public Object lookupFc(String s) throws NoSuchInterfaceException {
        switch (s){
            case "commandeNum": return commandNum;
            case "commandeImp": return commandImp;
            case "copieObtenue": return copieObtenue;
        }
        return null;
    }

    @Override
    public void bindFc(String s, Object o) throws NoSuchInterfaceException, IllegalBindingException, IllegalLifeCycleException {
        switch (s){
            case "commandeNum": commandNum= (CommandNum) o;break;
            case "commandeImp": commandImp= (CommandImp) o;break;
            case "copieObtenue": copieObtenue= (Doc) o;break;
        }
    }

    @Override
    public void unbindFc(String s) throws NoSuchInterfaceException, IllegalBindingException, IllegalLifeCycleException {
        switch (s){
            case "commandeNum": commandNum=null;break;
            case "commandeImp": commandImp=null;break;
            case "copieObtenue": copieObtenue=null;
        }
    }
}
