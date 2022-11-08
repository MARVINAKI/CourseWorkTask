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
    }
}