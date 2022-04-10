package io.npee.designpatterns._13_proxy._02_rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {}

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {

        try {
            MyRemoteImpl service = new MyRemoteImpl();
            Naming.bind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
