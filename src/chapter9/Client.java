package chapter9;

import javax.security.auth.callback.Callback;

public class Client implements Callback {
    public void callback(int p){
        System.out.println("метод callback(),"+"вызываемый со значением"+p);
    }void nonIfaceMeth(){
        System.out.println("В клласах реализующих интерфейсы");
    }
}
