class removeSpace {
    public static void main(String args[]) {
        String s = "Welome to MV Clouds";
        System.out.println("String before function implementation: " + s);
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                s1 = s1 + s.charAt(i);
        }
        System.out.println("String after function implementation: " + s1);
    }
}
