public class string_working {
    public static void main(String args[]){
        String name="Buddha Satta Dutta Roy";
        System.out.println(name);
        System.out.println(("The length of the string is "+name.length()));
        System.out.println(("The full string in uppercase will be \t"+name.toUpperCase()));
        System.out.println(("The full string in uppercase will be \t"+name.toLowerCase()));
        System.out.println(("The the index of  \t"+name.indexOf("Buddha")));

        String fname="buddha amar sona";
        String lname="suddha amar mona";
        String full_name=fname.concat(lname);
        System.out.println(full_name);


    }
}
