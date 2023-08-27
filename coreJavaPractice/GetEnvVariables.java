package coreJavaPractice;

class GetEnvVariables{

    public static void main(String[] a){
        String variableName = "PATH";
        String res = getEnvironmentalVariables(variableName);
        System.out.println(res);
    }

    public static String getEnvironmentalVariables(String variableName){
        String result = null;
        result = System.getenv(variableName);
        return result;
    }
}