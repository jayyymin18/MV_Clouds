public class nullPointer_Exception {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
