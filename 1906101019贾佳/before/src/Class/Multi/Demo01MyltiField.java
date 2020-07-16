package Class.Multi;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo01MyltiField {

    public static void main(String[] args) {
        Fu1 obj = new Zi1();

        System.out.println(obj.num);//Fu1变量 20

        obj.showNum();//该方法属于谁就调用谁，子类没有覆写就是Fu1的，覆写了就是Zi1的
    }


}
