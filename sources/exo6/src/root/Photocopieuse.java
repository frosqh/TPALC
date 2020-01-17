package root;

import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.objectweb.fractal.api.control.IllegalLifeCycleException;


//TODO Faire deux sortes de command.
public class Photocopieuse implements BindingController, Command, Doc {

    @Override
    public String[] listFc() {
        return new String[0];
    }

    @Override
    public Object lookupFc(String s) throws NoSuchInterfaceException {
        return null;
    }

    @Override
    public void bindFc(String s, Object o) throws NoSuchInterfaceException, IllegalBindingException, IllegalLifeCycleException {

    }

    @Override
    public void unbindFc(String s) throws NoSuchInterfaceException, IllegalBindingException, IllegalLifeCycleException {

    }

    @Override
    public void execute() {

    }

    @Override
    public String getContent() {
        return null;
    }
}
