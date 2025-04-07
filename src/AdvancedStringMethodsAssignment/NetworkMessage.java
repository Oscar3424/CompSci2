package AdvancedStringMethodsAssignment;

public class NetworkMessage {
    private String machineType;
    private String machineId;
    private String warning;

    public NetworkMessage(String n){
        machineType = n.substring(0,n.indexOf(":") - 1);
        machineId = n.substring(n.indexOf(":") - 1, n.indexOf(":"));
        warning = n.substring(n.indexOf(":"), n.length()).trim();


    }

    @Override
    public String toString() {
        return machineType + "___" + machineId + "___" + warning;
    }

    public String getMachineType() {
        return machineType;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getWarning() {
        return warning;
    }

//    boolean scanWarning(String name){
//
//    }





}


