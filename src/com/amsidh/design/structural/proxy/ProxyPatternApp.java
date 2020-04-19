package com.amsidh.design.structural.proxy;
//According to GoF, a Proxy Pattern "provides the control for accessing the original object".
public class ProxyPatternApp {
    public static void main(String[] args) {
        OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("Amsidh Lokhande");
        officeInternetAccess.grantInternetAccess();
    }
}

interface OfficeInternetAccess {
    void grantInternetAccess();
}

class RealInternetAccess implements OfficeInternetAccess {
    private String employeeName;

    RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }


    @Override
    public void grantInternetAccess() {
        System.out.println("Internet access is granted for employee " + employeeName);
    }
}

class ProxyInternetAccess implements OfficeInternetAccess {

    private String employeeName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (employeeLevel(employeeName) > 4) {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        } else {
            System.out.println("Employee Level is less than 4 so does not meet the internet access crateria");
        }
    }

    private Integer employeeLevel(String employeeName) {
        return 5;
    }
}