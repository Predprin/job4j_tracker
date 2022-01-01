package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("The element was not found in the array");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] shops = {"Amazon", "Ebay", "Ozon", "Wildberries"};
        try {
            System.out.println(indexOf(shops, "Ozon"));
            System.out.println(indexOf(shops, "Avito"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
