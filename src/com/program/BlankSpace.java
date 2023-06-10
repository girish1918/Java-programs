package com.program;

class BlankSpace {
    public static void main(String[] args)
    {
        String str = "     Gi  ri  sh    ";
 
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
 
        System.out.println(str);
    }
}