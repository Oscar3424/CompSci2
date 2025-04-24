package AdvancedStringMethodsAssignment;

public class NetworkMessage {
    private String machineType;
    private String machineId;
    private String warning;

    public NetworkMessage(String n){
        machineType = n.substring(0,n.indexOf(":") - 1);
        machineId = n.substring(n.indexOf(":") - 1, n.indexOf(":"));
//        warning = n.substring(n.indexOf(":"), n.length()).trim();
//        if(n.contains(":")){
            warning = n.substring(n.indexOf(":") + 1).replaceAll("^\\s+|\\s+$", "");



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

    public boolean scanWarning(String keyword){
        if(warning.startsWith(keyword + " ")){
            return true;
        }
//        if(warning.contains(keyword)){
//            return true;
//        }

        return false;



    }





}


