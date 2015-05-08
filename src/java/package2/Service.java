package package2;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "Service")
@Stateless()
public class Service {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1 + num2;
    }

    @WebMethod(operationName = "substraction")
    public int substraction(@WebParam(name = "parameter1") int parameter1, @WebParam(name = "parameter2") int parameter2) {
        return parameter1 - parameter2;
    }

    @WebMethod(operationName = "multiplication")
    public int multiplication(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1 * num2;
    }

    @WebMethod(operationName = "division")
    public int division(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1 / num2;
    }
}
