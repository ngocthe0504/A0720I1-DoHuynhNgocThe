package Access_Modifier.Bai_Tap;

public class Main {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier(4);
        System.out.println(accessModifier.getArea());
        accessModifier.setRadius(1);
        System.out.println(accessModifier.getArea());

    }
}
