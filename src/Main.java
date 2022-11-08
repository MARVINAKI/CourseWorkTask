public class Main {
    public static void main(String[] args) {
        String str = "Топотs";
        boolean check = true;
        str = str.toLowerCase().replace(" ", "");
        char[] mas = str.toCharArray();
        for (int f = 0, l = mas.length - 1; f < mas.length; f++, l--) {
            if (mas[f] != mas[l]) {
                check=false;
                break;
            }
        }
        System.out.println(check ? "YES" : "NO");

        String str1 = "Топот";
        str1 = str1.toLowerCase().replace(" ", "");
        System.out.println(str1.equals(new StringBuilder(str1).reverse().toString())?"YES":"NO");
    }
}